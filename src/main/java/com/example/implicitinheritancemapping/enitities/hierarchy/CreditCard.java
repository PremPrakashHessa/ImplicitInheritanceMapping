package com.example.implicitinheritancemapping.enitities.hierarchy;


import jakarta.persistence.*;
import lombok.Data;

import java.time.Year;
import java.time.YearMonth;

@Entity
@DiscriminatorValue("CREDIT")
@SecondaryTable(
        name = "CREDITCARD",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "CREDITCARD_ID")
)
@Data

public class CreditCard extends BillingInfo{

    @Column(nullable = false,table = "CREDITCARD")
    private long creditCardNumber;

    @Column(nullable = false,table = "CREDITCARD")
    private YearMonth expiryMonth;

    @Column(nullable = false,table = "CREDITCARD")
    private Year expiryYear;

    @Column(nullable = false,table = "CREDITCARD")
    private double creditLimit;

   /* @OneToOne
    private User user;*/
}
