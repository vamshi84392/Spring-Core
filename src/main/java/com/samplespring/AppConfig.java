package com.samplespring;

import com.samplespring.repository.CustomerRepository;
import com.samplespring.repository.impl.HibernateCustomerRepositoryImpl;
import com.samplespring.service.CustomerService;
import com.samplespring.service.impl.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.samplespring"})
public class AppConfig {

    /*@Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }*/

    /*@Bean(name = "customerService")
    public CustomerService getCustomerService(){
        CustomerServiceImpl service = new CustomerServiceImpl();
//        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository()); //Constructor Injection
//        service.setCustomerRepository(getCustomerRepository()); //Setter Injection
        return service;
    }*/
}
