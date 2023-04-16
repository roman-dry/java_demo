package com.example.demo;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class TestService {
    private int Serv;

    @PostConstruct
    void intoServ() {
        System.out.println("We`re getting @Service");
    }
}
