package com.example.implicitinheritancemapping.enitities.hierarchy;


import jakarta.persistence.*;
import lombok.Data;

import java.time.Year;
import java.time.YearMonth;

@Entity
@Data

public class CreditCard extends BillingInfo{


    private long creditCardNumber;

    private YearMonth expiryMonth;

    private Year expiryYear;

    private double creditLimit;

   /* @OneToOne
    private User user;*/
}
