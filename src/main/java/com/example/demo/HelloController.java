package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @Autowired private Environment environment;    
    @GetMapping("/")
    public String hello() {
        String value = "Hello from TAP on AWS";
        if (environment.getProperty("env") != null)
            value+= " , today is a great day for" + environment.getProperty("env");
        
        return value;

    }
}