package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Customer extends BaseEntity{

    private String userName;
    private String name;
    private String surName;
    private String email;
    private String address;

    @OneToMany (mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Payment> paymentList;

    public Customer(String userName, String name, String surName, String email, String address) {
        this.userName = userName;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
    }
}
