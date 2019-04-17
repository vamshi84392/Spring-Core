package com.samplespring.service;

import com.samplespring.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
