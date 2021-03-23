package com.fakhri.ib.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResources {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World Spring Universe this is my first project";
    }
}
