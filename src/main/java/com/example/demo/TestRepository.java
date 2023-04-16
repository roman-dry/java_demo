package com.example.demo;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Data
public class TestRepository {
    private Map<Integer, String> myStorage;


    @PostConstruct
    void putStorage() {
        System.out.println("We`re getting @Repository");
    }
}
