package com.cydeo.bootstrap;

import com.cydeo.repository.DepartrmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

        RegionRepository regionRepository;
        EmployeeRepository employeeRepository;
        DepartrmentRepository departrmentRepository;

    public DataGenerator(RegionRepository regionRepository, EmployeeRepository employeeRepository, DepartrmentRepository departrmentRepository) {
        this.regionRepository = regionRepository;
        this.employeeRepository = employeeRepository;
        this.departrmentRepository = departrmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("_____________ SSSS________________");
        System.out.println(regionRepository.findByCountry("Canada"));
//        System.out.println(regionRepository.findRegionByCountry("United States"));
//        System.out.println(regionRepository.findRegionByCountry("Asia"));
//        System.out.println(regionRepository.findDistinctByCountry("United States"));
//        System.out.println(regionRepository.findByCountryContains("United"));
//        System.out.println(regionRepository.findByCountryContainsOrderByCountry("Asia"));
//        System.out.println(employeeRepository.findByEmail("npointona@vistaprint.com"));
//        System.out.println(employeeRepository.findByEmailNull());
//        System.out.println(employeeRepository.getEmployeeDetail());
        System.out.println(employeeRepository.getEmployeeSalary());
        System.out.println("_____________ SSSS________________");

    }
}
