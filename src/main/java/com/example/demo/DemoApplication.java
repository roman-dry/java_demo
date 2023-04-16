package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MyAnnotation
@Configuration
public class DemoApplication {
    @Bean
    String string() {
        return new String("boo");
    }

    @Bean
    String string2() {
        return new String("woof");
    }

    public static void main(String[] args) {

        var context = SpringApplication.run(DemoApplication.class, args);
        var bean = context.getBean("string2");
        System.out.println(bean);
        var bean2 = context.getBean(TestController.class);
        System.out.println(bean2);
        var bean3 = context.getBean(TestComponent.class);
        System.out.println(bean3);
        var bean4 = context.getBean(TestRepository.class);
        System.out.println(bean4);
        var bean5 = context.getBean(TestService.class);
        System.out.println(bean5);



    }

}
