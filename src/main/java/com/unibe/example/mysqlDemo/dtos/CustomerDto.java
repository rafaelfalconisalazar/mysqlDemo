package com.unibe.example.mysqlDemo.dtos;

import com.unibe.example.mysqlDemo.entities.Customer;

import java.util.Base64;

public class CustomerDto {

    private String id;

    private String name,phone,email,passoword;

    public CustomerDto(){}

    public CustomerDto(String id, String name, String phone, String email, String passoword) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.passoword = passoword;
    }

    public CustomerDto(Customer customer){
        this.id=customer.getId();
        this.name=customer.getName();
        this.phone=customer.getPhone();
        this.email=customer.getEmail();
        this.passoword=customer.getPassoword();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", passoword='" + passoword + '\'' +
                '}';
    }
}
