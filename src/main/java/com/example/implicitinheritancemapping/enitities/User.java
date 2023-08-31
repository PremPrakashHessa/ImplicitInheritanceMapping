package com.example.implicitinheritancemapping.enitities;

import com.example.implicitinheritancemapping.enitities.hierarchy.BillingInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
    TRYING TO MAP ASSOCIATION
    EACH USER HAS A DEFAULT BILLING INFO
     */

    @OneToOne(cascade = CascadeType.ALL)

    private BillingInfo defaultBillinginfo;

    /*

     */
    @ManyToOne
    private BillingInfo sharedBillingDetails;

    /*
    EACH USER MAY HAVE MULTIPLE BILLING INFORMATION
     */

    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private Set<BillingInfo> billingInfos = new HashSet<>();


    public User(String username,LocalDate registrationDate){
        this.username = username;
        this.registrationDate = registrationDate;
    }
}
