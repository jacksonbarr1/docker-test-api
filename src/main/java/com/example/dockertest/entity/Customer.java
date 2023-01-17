package com.example.dockertest.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private int id;
    private String name;
    private String phone;
    private String email;
    private Customer[] friends;
}
