package com.unibe.example.mysqlDemo.controller;

import com.unibe.example.mysqlDemo.dtos.CustomerDto;
import com.unibe.example.mysqlDemo.entities.Customer;
import com.unibe.example.mysqlDemo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(CustomerDto customerDto){
        Customer customer= new Customer(customerDto.getId(),customerDto.getName(),
                customerDto.getPhone(),customerDto.getEmail(),customerDto.getPassoword());
        this.customerRepository.save(customer);

    }

}
