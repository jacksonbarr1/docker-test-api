package com.example.dockertest.controller;


import com.example.dockertest.entity.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

    @Value("${version}")
    private String version;

    private final Customer customer1 = Customer.builder()
            .id(1)
            .name("Jackson")
            .phone("7703775434")
            .email("jacksonbarr2021@gmail.com")
            .build();

    private final Customer customer2 = Customer.builder()
            .id(2)
            .name("Jaava")
            .phone("7703775434")
            .email("jacksonbarr2021@gmail.com")
            .build();

    private final Customer customer3 = Customer.builder()
            .id(3)
            .name("Pythonnn")
            .phone("7703775434")
            .email("jacksonbarr2021@gmail.com")
            .friends(new Customer[] {customer1, customer2})
            .build();

    @GetMapping("/")
    public String home() {
        return "Hello Docker\nVersion: " + version;
    }

    @GetMapping("/{id}")
    public String searchById(@PathVariable int id) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(customer3);
    }
}
