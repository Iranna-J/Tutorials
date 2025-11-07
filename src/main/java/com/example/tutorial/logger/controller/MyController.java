package com.example.tutorial.logger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.logger.service.MyService;

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/run-task")
    public String runTask() {
        myService.performTask();
        return "Task executed! Check logs.";
    }
}
