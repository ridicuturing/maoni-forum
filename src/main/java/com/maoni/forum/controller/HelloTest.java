package com.maoni.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {
    @RequestMapping("/")
    public String hello(){
        return "hello maoni forum";
    }
}
