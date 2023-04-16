package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("testx")
public class SecondTestController {
    @GetMapping("/testx")
    public String woof() {
        return "woof";
    }
}
