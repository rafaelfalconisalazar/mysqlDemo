package com.unibe.example.mysqlDemo.resources;

import com.unibe.example.mysqlDemo.controller.CustomerController;
import com.unibe.example.mysqlDemo.dtos.CustomerDto;
import com.unibe.example.mysqlDemo.resources.exeptions.CustomerAllreadyExistExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(CustomerResource.CUSTOMER)
public class CustomerResource {

    public static final String CUSTOMER = "/customers";

    @Autowired
    private CustomerController customerController;

    @PutMapping
    public void createCustomer(@Valid @RequestBody CustomerDto customerDto) throws CustomerAllreadyExistExeption {
        this.customerController.createCustomer(customerDto);

    }
}
