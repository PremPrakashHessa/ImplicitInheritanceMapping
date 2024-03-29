package com.example.implicitinheritancemapping.enitities.hierarchy;


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@AttributeOverride(
        name = "owner",
        column = @Column(name = "ac_owner")
)
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
