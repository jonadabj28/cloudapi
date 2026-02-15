package com.jonadab.cloudapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Cloud API is running successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy.";
    }
}
