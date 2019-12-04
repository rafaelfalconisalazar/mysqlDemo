package com.unibe.example.mysqlDemo.repositories;

import com.unibe.example.mysqlDemo.entities.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor,String> {
}
