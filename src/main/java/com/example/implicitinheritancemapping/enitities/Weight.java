package com.example.implicitinheritancemapping.enitities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@AttributeOverrides(
        value = {
                @AttributeOverride( name = "name" , column = @Column(name = "Weight_name")),
                @AttributeOverride(name = "symbol" , column = @Column(name = "Weight_symbol"))
        }
)
@Data
public class Weight extends Measurement{

    @Column(nullable = false) private double weight;
}
