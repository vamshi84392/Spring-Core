package com.samplespring.service.impl;

import com.samplespring.model.Customer;
import com.samplespring.repository.CustomerRepository;
import com.samplespring.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.getAllCustomer();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
