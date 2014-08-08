package hello

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan
@Configuration
@EnableAutoConfiguration
class App {}

object App {
	def main(args: Array[String]){
	  SpringApplication.run(Array(classOf[App]).asInstanceOf[Array[Object]], args)
	}
}
