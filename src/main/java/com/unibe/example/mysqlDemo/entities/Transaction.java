package com.unibe.example.mysqlDemo.entities;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double value,valueAccount;

    private String date;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Account account;

    public Transaction(){}

    public Transaction(int id, double value, double valueAccount, String date, Account account) {
        this.id = id;
        this.value = value;
        this.valueAccount = valueAccount;
        this.date = date;
        this.account = account;
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

    public double getValueAccount() {
        return valueAccount;
    }

    public void setValueAccount(double valueAccount) {
        this.valueAccount = valueAccount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
