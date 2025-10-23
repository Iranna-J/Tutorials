package com.example.tutorial.beanScope.service;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class SingletonService {

    private final String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
