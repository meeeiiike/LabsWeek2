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

    @GetMapping("/getPerson")
    public Person getPerson(){
        return new Person("mike", 23);
    }

    @GetMapping("/calculate")
    public Calculator calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation){
        Calculator calculator = new Calculator(num1, num2, operation);
        calculator.calculateTotal();
        return calculator;
    }
}
