package com.samplespring.service.impl;

import com.samplespring.model.Customer;
import com.samplespring.repository.CustomerRepository;
import com.samplespring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    /*public CustomerServiceImpl() {
    }*/

    //    @Autowired //Constructor Injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using Constructor Injection");
        this.customerRepository = customerRepository;
    }

//    @Autowired //member Autowire annotation
    private CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.getAllCustomer();
    }

    @Autowired // Setter Injection Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using Setter Injection");
        this.customerRepository = customerRepository;
    }
}
