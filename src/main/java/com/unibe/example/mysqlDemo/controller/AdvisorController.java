package com.unibe.example.mysqlDemo.controller;

import com.unibe.example.mysqlDemo.dtos.AdvisorDto;
import com.unibe.example.mysqlDemo.entities.Advisor;
import com.unibe.example.mysqlDemo.repositories.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvisorController {

    @Autowired
    private AdvisorRepository advisorRepository;

    public void createAdvisor(AdvisorDto advisorDto){
        Advisor advisor= new Advisor( advisorDto.getId(),advisorDto.getName(),advisorDto.getPhone(),
                advisorDto.getEmail(),advisorDto.getPassoword());
        this.advisorRepository.save(advisor);
    }
}
