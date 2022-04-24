package com.cydeo.repository;

import com.cydeo.entity.Merchant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface MerchantRepository extends JpaRepository<Merchant, BigDecimal> {
}
