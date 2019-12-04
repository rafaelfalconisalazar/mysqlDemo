package com.unibe.example.mysqlDemo.repositories;

import com.unibe.example.mysqlDemo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
