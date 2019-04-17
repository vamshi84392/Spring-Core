package com.samplespring.repository.impl;

import com.samplespring.model.Customer;
import com.samplespring.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setfName("Vamshi");
        customer.setlName("Mathukumilli");
        customerList.add(customer);
        return customerList;
    }
}