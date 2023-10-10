package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @Autowired private Environment environment;    
    @GetMapping("/hello")
    public String hello() {
        String value = "Hello from Azure Spring Apps, today is a greay day";
        if (environment.getProperty("env") != null)
            value+= " " + environment.getProperty("env");
        
        return value;

    }
}