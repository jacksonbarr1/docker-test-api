package com.example.dockertest.controller;


import com.example.dockertest.entity.Customer;
import com.example.dockertest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class DockerTestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public String home() {
        return "Hello Docker";
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable int id) {
        return customerService.findById(id);
    }

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
