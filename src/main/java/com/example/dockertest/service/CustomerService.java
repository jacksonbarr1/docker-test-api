package com.example.dockertest.service;

import com.example.dockertest.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Customer findById(int id);

    Customer saveCustomer(Customer customer);
}
