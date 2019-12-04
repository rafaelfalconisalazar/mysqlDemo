package com.unibe.example.mysqlDemo.dtos;

import com.unibe.example.mysqlDemo.entities.Transaction;

public class TransactionDto {

    private int id;

    private double value,valueAccount;

    private String date;

    private AccountDto accountDto;

    public TransactionDto(){}

    public TransactionDto(int id, double value, double valueAccount, String date, AccountDto accountDto) {
        this.id = id;
        this.value = value;
        this.valueAccount = valueAccount;
        this.date = date;
        this.accountDto = accountDto;
    }

    public TransactionDto(Transaction transaction){
        this.id= transaction.getId();
        this.value=transaction.getValue();
        this.valueAccount=transaction.getValueAccount();
        this.date=transaction.getDate();
        this.accountDto= new AccountDto(transaction.getAccount());
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

    public AccountDto getAccountDto() {
        return accountDto;
    }

    public void setAccountDto(AccountDto accountDto) {
        this.accountDto = accountDto;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id=" + id +
                ", value=" + value +
                ", valueAccount=" + valueAccount +
                ", date='" + date + '\'' +
                ", accountDto=" + accountDto +
                '}';
    }
}
