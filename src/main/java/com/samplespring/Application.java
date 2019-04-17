package com.samplespring;

import com.samplespring.service.CustomerService;
import com.samplespring.service.impl.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0));
    }
}
