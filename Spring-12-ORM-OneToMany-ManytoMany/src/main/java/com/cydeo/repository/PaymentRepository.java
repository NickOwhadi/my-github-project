package com.cydeo.repository;

import com.cydeo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PaymentRepository extends JpaRepository<Payment, BigDecimal> {
}
