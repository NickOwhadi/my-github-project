package com.cydeo.bootstrap;

import com.cydeo.entity.Account;
import com.cydeo.enums.UserRole;
import com.cydeo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DataGenerator implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public DataGenerator(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------Account Derived Country or State--------------");
        accountRepository.findByCountryOrState(null, "New York").forEach(System.out::println);
        System.out.println("-------------Account Derived Age less than or equal--------------");
        accountRepository.findByAgeLessThanEqual(35).forEach(System.out::println);
        System.out.println("-------------Account Derived Role--------------");
        accountRepository.findByRole(UserRole.USER).forEach(System.out::println);
        System.out.println("-------------Account Derived Age Between--------------");
        accountRepository.findByAgeBetween(20,46).forEach(System.out::println);
        System.out.println("-------------Account Derived Address Start With--------------");
        accountRepository.findByAddressStartingWith("2").forEach(System.out::println);
        System.out.println("-------------Account Derived Age Sorted--------------");
        //accountRepository.findByAgeBetweenOrderByAgeDesc(0,100).forEach(System.out::println);
        System.out.println("-------------Account Derived--------------");
        //accountRepository.findByAgeIsNotNullOrderByAgeDesc().forEach(System.out::println);
        accountRepository.findByOrderByAgeDesc().forEach(System.out::println);
        System.out.println("---------------------------Account JPQL QUERIES All Accounts ---------------------------------");
        accountRepository.getAllAccounts().forEach(System.out::println);
        System.out.println("---------------------------Account JPQL QUERIES ADMIN Role ---------------------------------");
        accountRepository.getAllAdminAccounts(UserRole.ADMIN).forEach(System.out::println);
        System.out.println("---------------------------Account JPQL QUERIES All Account sorted with Age  ---------------------------------");
        accountRepository.getAllWithAge().forEach(System.out::println);
        System.out.println("---------------------------Account Native QUERIES age less than ---------------------------------");
        accountRepository.readALlAccountWithAgeLowerThan(46).forEach(System.out::println);
        System.out.println("---------------------------Account Native QUERIES ---------------------------------");
        accountRepository.readALlAccountWithAgeLowerThan(48).forEach(System.out::println);
        System.out.println("---------------------------Account JPQL QUERIES ---------------------------------");
        System.out.println("---------------------------Account JPQL QUERIES ---------------------------------");
        System.out.println("---------------------------Account JPQL QUERIES ---------------------------------");

    }
}
