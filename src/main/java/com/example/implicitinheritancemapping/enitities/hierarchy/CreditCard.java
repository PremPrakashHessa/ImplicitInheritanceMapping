package com.example.implicitinheritancemapping.enitities.hierarchy;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

import java.time.Year;
import java.time.YearMonth;

@Entity
@Data
@AttributeOverride(
        name = "owner",
        column = @Column(name = "cc_owner")
)
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
