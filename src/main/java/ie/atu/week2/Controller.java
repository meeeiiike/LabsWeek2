package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name;
    }

}
