package com.taskManager.Task.manager.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class testingAPI {
    @RequestMapping("/testing")
    public String helloWorld() {
        return "Hello, World!";
    }
}
