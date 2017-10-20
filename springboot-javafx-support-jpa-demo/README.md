Spring Boot JavaFX JPA Example
==============================

Simple Spring Boot app that uses the [springboot-javafx-support](https://github.com/roskenet/springboot-javafx-support) library.

Prototypical example on how one could use Spring-Boot with JavaFX and JPA under Java 8.  

Run with `mvn spring-boot:run` or with `java -jar target/springboot-javafx-*.jar` 

Note that the link between  `demo.projects.ui.ProjectsController` and `demo.projects.ui.ProjectsView` is established 
via `fx:controller="demo.projects.ui.ProjectsController"` in the `src/main/java/demo/projects/ui/projects.fxml`.

![UI in Action](example-1.png "UI in Action")
