package com.unibe.example.mysqlDemo.resources;

import com.unibe.example.mysqlDemo.dtos.CustomerDto;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:test.properties")
public class CustomerResourceTest {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Autowired
    private RestService restService;
    private CustomerDto customerDto;

    @Before
    public void before(){

        this.customerDto= new CustomerDto("1716203292","Rafael",
                "45646","a@a.com","adsfasdf");
    }

    @Test
    public void createCustomer() {
        restService.restBuilder().path(CustomerResource.CUSTOMER).body(this.customerDto).post().build();
    }
}