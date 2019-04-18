package com.samplespring.repository.impl;

import com.samplespring.model.Customer;
import com.samplespring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${db.user}")
    private String dbUserName;

    @Override
    public List<Customer> getAllCustomer() {
        System.out.println(this.dbUserName);
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setfName("Vamshi");
        customer.setlName("Mathukumilli");
        customerList.add(customer);
        return customerList;
    }
}
