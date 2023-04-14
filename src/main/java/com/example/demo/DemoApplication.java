package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MyAnnotation
public class DemoApplication {

    public static void main(String[] args) {
        var clazz = DemoApplication.class;
        var annotations = clazz.getDeclaredAnnotations();
        System.out.println(annotations);


//        SpringApplication.run(DemoApplication.class, args);
    }

}
