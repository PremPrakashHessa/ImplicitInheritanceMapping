package com.example.implicitinheritancemapping.enitities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

@Embeddable
@AttributeOverride(
        name = "name",
        column = @Column(name = "Dimension_name")
)
@AttributeOverride(
        name = "symbol",
        column = @Column(name = "Dimension_symbol")
)
@Data
public class Dimension extends Measurement{

    private float height;
    private float breadth;
    private float width;
}
