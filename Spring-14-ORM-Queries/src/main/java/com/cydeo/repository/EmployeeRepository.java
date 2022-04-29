package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.hibernate.annotations.Where;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.From;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByEmail(String email);
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);
    List<Employee>findByFirstNameIsNot(String firstName);
    List<Employee>findByLastNameStartsWith(String startLastName);
    List<Employee> findBySalaryGreaterThan(Integer salary);
    List<Employee> findBySalaryLessThan(Integer salary);
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);
    List<Employee> findBySalaryGreaterThanEqualOrderBySalaryDesc(Integer salary);
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);
    List<Employee> findByEmailNull();
    @Query("SELECT e FROM Employee e WHERE e.email = 'npointona@vistaprint.com'")
    Employee getEmployeeDetail();
    @Query("select e.salary from Employee e WHERE e.firstName ='Alyson'")
    Integer getEmployeeSalary();
    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);
    @Query("SELECT e from Employee e WHERE e.email=?1 and e.salary=?2")
    Optional<Employee> getEmployeeDetail(String email, int salary );

    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> getSalaryNot(int salary);

    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 and ?2")
    List<Employee> getSalaryBetween(int salary1, int salry2);


    @Query("SELECT e FROM Employee e WHERE e.email is null")
    Optional<Employee> getEmployeeWithNullEmail();

    @Query("SELECT e FROM Employee e WHERE e.email is NOT null")
    List<Employee> getEmployeeWithNotNullEmail();






    @Query(value = "select * FROM employees where salary ?1", nativeQuery = true)
    List<Employee> getEmployeeDetailsBySalary(int salary);






}
