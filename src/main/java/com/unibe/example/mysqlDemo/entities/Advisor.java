package com.unibe.example.mysqlDemo.entities;

import javax.persistence.Entity;

@Entity
public class Advisor extends User {
    public Advisor() {
    }

    public Advisor(String id, String name, String phone, String email, String passoword) {
        super(id, name, phone, email, passoword);
    }
}
