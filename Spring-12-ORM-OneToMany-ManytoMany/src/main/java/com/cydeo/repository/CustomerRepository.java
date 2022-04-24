package com.cydeo.repository;

import com.cydeo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface CustomerRepository extends JpaRepository<Customer, BigDecimal> {
}
