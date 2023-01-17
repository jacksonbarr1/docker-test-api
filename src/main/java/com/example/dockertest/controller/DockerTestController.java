package com.example.dockertest.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

    @Value("${version}")
    private String version;

    @GetMapping("/")
    public String home() {
        return "Hello " + version;
    }
}
