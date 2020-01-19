package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class TestController {

    @GetMapping("/response")
    public String getResponse() {

        return "This is test API Response.";
    }

    @PostConstruct
    public void execute() {
        System.out.println("TestController Called");
    }

}
