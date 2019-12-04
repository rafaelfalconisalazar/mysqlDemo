package com.unibe.example.mysqlDemo.repositories;

import com.unibe.example.mysqlDemo.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
