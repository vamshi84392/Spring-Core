package com.samplespring.service.impl;

import com.samplespring.model.Customer;
import com.samplespring.repository.CustomerRepository;
import com.samplespring.repository.impl.HibernateCustomerRepositoryImpl;
import com.samplespring.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.getAllCustomer();
    }
}
