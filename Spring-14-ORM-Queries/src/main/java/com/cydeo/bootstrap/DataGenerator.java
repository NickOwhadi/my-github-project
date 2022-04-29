package com.cydeo.bootstrap;

import com.cydeo.entity.Course;
import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartrmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class DataGenerator implements CommandLineRunner {

        RegionRepository regionRepository;
        EmployeeRepository employeeRepository;
        DepartrmentRepository departrmentRepository;
        CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, EmployeeRepository employeeRepository, DepartrmentRepository departrmentRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.employeeRepository = employeeRepository;
        this.departrmentRepository = departrmentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("_____________ SSSS________________");
//        System.out.println(regionRepository.findByCountry("Canada"));
//        System.out.println(regionRepository.findRegionByCountry("United States"));
//        System.out.println(regionRepository.findRegionByCountry("Asia"));
//        System.out.println(regionRepository.findDistinctByCountry("United States"));
//        System.out.println(regionRepository.findByCountryContains("United"));
//        System.out.println(regionRepository.findByCountryContainsOrderByCountry("Asia"));
//        System.out.println(employeeRepository.findByEmail("npointona@vistaprint.com"));
//        System.out.println(employeeRepository.findByEmailNull());
//        System.out.println(employeeRepository.getEmployeeDetail());
//        System.out.println(employeeRepository.getEmployeeSalary());
//        System.out.println(courseRepository.findByCategory("Spring"));
//        courseRepository.findByCategory("Spring").forEach(System.out::println);
//        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
//        System.out.println(courseRepository.existsByName("Rapid Spring Boot Application Development"));
//        System.out.println(courseRepository.countByCategory("Spring"));
//        courseRepository.findByNameStartingWith("G").forEach(System.out::println);
        System.out.println(employeeRepository.getSalaryNot(50000));
        System.out.println("_____________ SSSS________________");

    }
}
