package com.example.implicitinheritancemapping.enitities;

import com.example.implicitinheritancemapping.enitities.hierarchy.BillingInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue
    private long userId;

    private String username;
    private LocalDate registrationDate;
    private String email;
    private boolean active;
    private int level;

    /*
    says basic attribute type should not be a mapped super class
     */

    //private BillingInfo billingInfo;


    public User(String username,LocalDate registrationDate){
        this.username = username;
        this.registrationDate = registrationDate;
    }
}
