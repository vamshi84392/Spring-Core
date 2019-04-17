package com.samplespring;

import com.samplespring.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
//        CustomerService service = new CustomerServiceImpl();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = context.getBean("custService", CustomerService.class);
        System.out.println(service.findAll().get(0));
    }
}
