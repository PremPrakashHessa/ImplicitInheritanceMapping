package com.example.implicitinheritancemapping.enitities.hierarchy;

import com.example.implicitinheritancemapping.enitities.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BD")
@Data
public abstract class BillingInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String owner;

}
