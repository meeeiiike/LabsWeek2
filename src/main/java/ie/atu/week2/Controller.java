package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getDetails")
    public String getDetails(@RequestParam String name, @RequestParam int age){
        return "name: " + name  + " age: " + age;
    }

}
