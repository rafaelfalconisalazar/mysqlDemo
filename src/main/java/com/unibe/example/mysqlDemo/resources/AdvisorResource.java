package com.unibe.example.mysqlDemo.resources;

import com.unibe.example.mysqlDemo.controller.AdvisorController;
import com.unibe.example.mysqlDemo.dtos.AdvisorDto;
import com.unibe.example.mysqlDemo.repositories.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(AdvisorResource.ADVISOR)
public class AdvisorResource {

    public static final String ADVISOR="advisors";

    @Autowired
    private AdvisorController advisorController;

    @PostMapping
    public void createAdvisor(@Valid @RequestBody AdvisorDto advisorDto){
        this.advisorController.createAdvisor(advisorDto);
    }


}
