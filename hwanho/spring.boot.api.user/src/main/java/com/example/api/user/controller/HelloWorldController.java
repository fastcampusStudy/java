package com.example.api.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/api/helloworld")
    public String getHelloworld() {
        return "HelloWorld";
    }

    @PostMapping(value = "/api/helloworld")
    public String postHelloworld() {
        return "HelloWorld";
    }
}
