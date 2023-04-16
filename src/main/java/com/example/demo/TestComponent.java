package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class TestComponent {
    @GetMapping("/testy")
    public String boom() {
        return "boom";
    }

    @PostConstruct
    void setUp() {
        System.out.println("We`re ready to serve with boom!");
    }

}
