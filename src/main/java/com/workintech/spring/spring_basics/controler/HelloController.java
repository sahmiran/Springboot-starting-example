package com.workintech.spring.spring_basics.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hi")
    public String sayHi(){
        return "Hello String";
    }
}
