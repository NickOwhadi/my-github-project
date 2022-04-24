package com.cydeo.repository;

import com.cydeo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ItemRepository extends JpaRepository<Item, BigDecimal> {
}
