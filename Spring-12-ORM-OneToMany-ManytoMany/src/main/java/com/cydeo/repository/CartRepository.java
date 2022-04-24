package com.cydeo.repository;

import com.cydeo.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface CartRepository extends JpaRepository<Cart, BigDecimal> {
}
