package com.example.tutorial.beanScope.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.beanScope.service.ApplicationService;
import com.example.tutorial.beanScope.service.PrototypeService;
import com.example.tutorial.beanScope.service.RequestService;
import com.example.tutorial.beanScope.service.SessionService;
import com.example.tutorial.beanScope.service.SingletonService;

@RestController
public class ScopeController {

    private final SingletonService singletonService;
    private final PrototypeService prototypeService;
    private final RequestService requestService;
    private final SessionService sessionService;
    private final ApplicationService applicationService;

    public ScopeController(
            SingletonService singletonService,
            PrototypeService prototypeService,
            RequestService requestService,
            SessionService sessionService,
            ApplicationService applicationService
    ) {
        this.singletonService = singletonService;
        this.prototypeService = prototypeService;
        this.requestService = requestService;
        this.sessionService = sessionService;
        this.applicationService = applicationService;
    }

    @GetMapping("/scopes")
    public Map<String, String> getScopes() {
        return Map.of(
                "singleton", singletonService.getId(),
                "prototype", prototypeService.getId(),
                "request", requestService.getId(),
                "session", sessionService.getId(),
                "application", applicationService.getId()
        );
    }
}
