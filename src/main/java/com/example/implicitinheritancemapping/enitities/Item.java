package com.example.implicitinheritancemapping.enitities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
    private long itemID;

    private String itemName;

    @Embedded
    private Dimension dimensions;
    @Embedded
    private Weight weight;
}
