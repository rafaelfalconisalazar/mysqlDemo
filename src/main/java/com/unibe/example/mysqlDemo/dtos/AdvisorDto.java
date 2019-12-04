package com.unibe.example.mysqlDemo.dtos;

import com.unibe.example.mysqlDemo.entities.Advisor;

public class AdvisorDto {

    private String id;

    private String name,phone,email,passoword;

    public AdvisorDto(){

    }

    public AdvisorDto(String id, String name, String phone, String email, String passoword) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.passoword = passoword;
    }

    public AdvisorDto(Advisor advisor){
        this.id = advisor.getId();
        this.name = advisor.getName();
        this.phone = advisor.getPhone();
        this.email = advisor.getEmail();
        this.passoword = advisor.getEmail();
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
        return "AdvisorDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", passoword='" + passoword + '\'' +
                '}';
    }
}
