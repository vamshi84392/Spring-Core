package com.samplespring;

import com.samplespring.repository.CustomerRepository;
import com.samplespring.repository.impl.HibernateCustomerRepositoryImpl;
import com.samplespring.service.CustomerService;
import com.samplespring.service.impl.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.samplespring"})
@PropertySource("app.properties")
public class AppConfig {


    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
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
