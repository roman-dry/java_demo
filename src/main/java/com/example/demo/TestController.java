package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("test")
public class TestController {
    @GetMapping("/test")
    public String indexHtml() {
        return "index.html";
    }

    @PostConstruct
    void setUp() {
        System.out.println("We`re ready to serve!");
    }
}
