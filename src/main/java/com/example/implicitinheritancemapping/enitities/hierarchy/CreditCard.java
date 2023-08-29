package com.example.implicitinheritancemapping.enitities.hierarchy;


import jakarta.persistence.*;
import lombok.Data;

import java.time.Year;
import java.time.YearMonth;

@Entity
@PrimaryKeyJoinColumn(name = "CreditCardID")
@Data

public class CreditCard extends BillingInfo{

    @Column(nullable = false)
    private long creditCardNumber;

    @Column(nullable = false)
    private YearMonth expiryMonth;

    @Column(nullable = false)
    private Year expiryYear;

    @Column(nullable = false)
    private double creditLimit;

   /* @OneToOne
    private User user;*/

}
