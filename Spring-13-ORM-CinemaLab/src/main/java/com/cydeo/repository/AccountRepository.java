package com.cydeo.repository;

import com.cydeo.entity.Account;
import com.cydeo.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state
    List<Account> findByCountryOrState(String country, String State);
    //Write a derived query to list all accounts with age lower than or equal to a specific value
    List<Account> findByAgeLessThanEqual(int age);
    //Write a derived query to list all accounts with a specific role
    List<Account> findByRole(UserRole role);
    //Write a derived query to list all accounts between a range of ages
    List<Account> findByAgeBetween(int startAge, int endAge);
    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findByAddressStartingWith(String startKeyword);
    //Write a derived query to sort the list of accounts with age
    List<Account> findByOrderByAgeDesc();
    List<Account> findByAgeBetweenOrderByAgeDesc(int intAge, int endAge);
    List<Account> findByAgeIsNotNullOrderByAgeDesc();
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts
    @Query("SELECT a FROM Account a")
    List<Account>  getAllAccounts();
    //Write a JPQL query to list all admin accounts
    @Query("SELECT a FROM Account a WHERE a.role = ?1")
    List<Account>  getAllAdminAccounts(UserRole role);
    //Write a JPQL query to sort all accounts with age
    @Query("SELECT a FROM Account a WHERE a.age is NOT NULL ORDER BY a.age DESC ")
    List<Account>  getAllWithAge();
    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value
    @Query(value = "select * from account_details where age < ?1",nativeQuery = true)
    List<Account> readALlAccountWithAgeLowerThan(@Param("age") Integer age);
    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city
    @Query(value = "SELECT * FROM account_details WHERE name ILIKE concat('%', ?1, '%') " +
            "OR country ILIKE concat('%', ?1, '%') " +
            "OR address ILIKE concat('%', ?1, '%') " +
            "OR state ILIKE concat('%', ?1, '%') " +
            "OR city ILIKE concat('%', ?1, '%') ", nativeQuery = true)
    List<Account> retrieveBySearchCriteria(@Param("pattern") String pattern);
    //Write a native query to read all accounts with an age lower than a specific value

}
