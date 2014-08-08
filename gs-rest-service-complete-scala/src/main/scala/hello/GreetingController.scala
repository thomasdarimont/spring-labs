package hello

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping
import java.util.concurrent.atomic.AtomicInteger

@RestController
class GreetingController {

    private val template = "Hello, %s!"
    private var counter: AtomicInteger = new AtomicInteger

    @RequestMapping(value=Array("/greeting"))
    def greeting(@RequestParam(value="name", required=false, defaultValue="World") name: String) : Greeting = {
    	Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}