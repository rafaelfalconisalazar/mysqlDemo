package com.unibe.example.mysqlDemo.dtos;

import com.unibe.example.mysqlDemo.entities.Account;

public class AccountDto {
    private int id;

    private double value;

    private String date;

    private AdvisorDto advisorDto;

    private CustomerDto customerDto;

    public AccountDto(){}

    public AccountDto(int id, double value, String date, AdvisorDto advisorDto, CustomerDto customerDto) {
        this.id = id;
        this.value = value;
        this.date = date;
        this.advisorDto = advisorDto;
        this.customerDto = customerDto;
    }

    public AccountDto(Account account){
        this.id= account.getId();
        this.value=account.getValue();
        this.date=account.getDate();
        this.customerDto= new CustomerDto(account.getCustomer());
        this.advisorDto= new AdvisorDto(account.getAdvisor());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public AdvisorDto getAdvisorDto() {
        return advisorDto;
    }

    public void setAdvisorDto(AdvisorDto advisorDto) {
        this.advisorDto = advisorDto;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "id=" + id +
                ", value=" + value +
                ", date='" + date + '\'' +
                ", advisorDto=" + advisorDto +
                ", customerDto=" + customerDto +
                '}';
    }
}
