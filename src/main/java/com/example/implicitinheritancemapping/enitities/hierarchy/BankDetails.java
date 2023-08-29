package com.example.implicitinheritancemapping.enitities.hierarchy;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("BANK")
@Data

public class BankDetails extends BillingInfo{

    @Column(nullable = false)
    private long accountNumber;
    @Column(nullable = false)
    private String bankName;
    @Column(nullable = false)
    private String swift;

    /*@OneToOne
    private User user;*/
}
