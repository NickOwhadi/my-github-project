package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartrmentRepository extends JpaRepository<Department, String> {
}
