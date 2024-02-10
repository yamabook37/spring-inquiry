package com.udemy.spring2hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public  String index() {
        return "Access Successes";
    }

    @GetMapping(value = "/hello")
    public  String hello() {
        return "Hello world!";
    }

}
