/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.components.MainLayout;

/**
 * @author Thomas Darimont
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class App extends Application {

	/**
	 *  Note that this is configured in application.properties
	 */
	@Value("${app.ui.title:Example App}")
	private String windowTitle;

	@Autowired
	private MainLayout mainLayout;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@PostConstruct
	public void startApp() {

		ApplicationWrapper.delegate = this;
		Application.launch(ApplicationWrapper.class);
	}

	@Override
	public void start(Stage stage) throws Exception {

		stage.setTitle(windowTitle);
		stage.setScene(new Scene(mainLayout));
		stage.setResizable(true);
		stage.centerOnScreen();
		stage.show();
	}
}
