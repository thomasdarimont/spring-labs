package demo;

import javafx.application.Application;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @author Thomas Darimont
 */
public abstract class AbstractJavaFxApplicationSupport extends Application {

	private static String[] savedArgs;

	private final ConfigurableApplicationContext applicationContext;

	public AbstractJavaFxApplicationSupport() {

		Import configClass = getClass().getAnnotation(Import.class);

		Object[] configClasses = (Object[]) configClass.value();
		applicationContext = SpringApplication.run(configClasses, savedArgs);

		AutowireCapableBeanFactory bf = applicationContext.getAutowireCapableBeanFactory();
		bf.autowireBean(this);

		applicationContext.getBeanFactory().registerSingleton(StringUtils.decapitalize(getClass().getSimpleName()), this);
	}

	@Override
	public void stop() throws Exception {
		super.stop();
		applicationContext.close();
	}

	protected static void launchApp(Class<? extends Application> appClass, String[] args) {

		AbstractJavaFxApplicationSupport.savedArgs = args;

		Application.launch(appClass, args);
	}
}
