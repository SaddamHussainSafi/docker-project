package com.example.unit_testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, Docker + Spring Boot is working!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test endpoint is running!";
    }
}
