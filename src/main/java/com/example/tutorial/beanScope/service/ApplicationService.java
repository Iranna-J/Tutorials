package com.example.tutorial.beanScope.service;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(WebApplicationContext.SCOPE_APPLICATION)
public class ApplicationService {

    private final String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
