package com.example.demo;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @Autowired private Environment environment;    
    @GetMapping("/")
    public String hello() {
        String value = "Hello from ASAe on Azure";
        if (environment.getProperty("env") != null)
            value+= ", today is a great day for tacos and " + environment.getProperty("env");
            value+= "<br>"  + LocalTime.now();
        return value;

    }
}