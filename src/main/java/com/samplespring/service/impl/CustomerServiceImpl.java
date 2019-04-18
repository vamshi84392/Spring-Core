package com.samplespring.service.impl;

import com.samplespring.model.Customer;
import com.samplespring.repository.CustomerRepository;
import com.samplespring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // Same instance for every request
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Different instance for each request
public class CustomerServiceImpl implements CustomerService {

//    @Autowired   //Member injection
    private CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();

    public CustomerServiceImpl() {
    }

//    @Autowired // Constructor Injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.getAllCustomer();
    }

    @Autowired // Setter Injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter injection");
        this.customerRepository = customerRepository;
    }
}
