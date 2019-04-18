package com.samplespring;

import com.samplespring.service.CustomerService;
import com.samplespring.service.impl.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        CustomerService service = context.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0));
    }
}
