package com.cydeo.repository;

import com.cydeo.entity.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface PaymentDetailRepository extends JpaRepository<PaymentDetail, BigDecimal> {
}
