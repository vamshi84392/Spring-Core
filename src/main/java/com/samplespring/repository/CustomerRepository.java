package com.samplespring.repository;

import com.samplespring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAllCustomer();
}
