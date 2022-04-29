package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByCategory(String category);
    List<Course> findByCategoryOrderByName(String category);
    Boolean existsByName(String name);
    Integer countByCategory(String category);
    List<Course> findByNameStartingWith(String start);
    Stream<Course>streamByCategory(String category);

}
