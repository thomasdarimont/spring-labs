package demo;


import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import demo.projects.ui.ProjectsView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App extends AbstractJavaFxApplicationSupport {

  public static void main(String[] args) {
    launchApp(App.class, ProjectsView.class, args);
  }
}