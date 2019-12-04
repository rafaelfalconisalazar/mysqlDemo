package com.unibe.example.mysqlDemo.entities;

import javax.persistence.Entity;

@Entity
public class Customer extends User {
    public Customer() {
    }

    public Customer(String id, String name, String phone, String email, String passoword) {
        super(id, name, phone, email, passoword);
    }
}
