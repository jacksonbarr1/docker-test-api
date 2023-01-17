package com.example.dockertest.controller;


import com.example.dockertest.entity.Customer;
import com.example.dockertest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

    @Autowired
    private CustomerService customerService;

    @Value("${version}")
    private String version;

    @GetMapping("/")
    public String home() {
        return "Hello Docker\nVersion: " + version;
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable int id) {
        return customerService.findById(id);
    }
}
