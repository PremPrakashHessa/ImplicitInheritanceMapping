package com.example.implicitinheritancemapping.enitities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;


@MappedSuperclass
@Data
public abstract class Measurement {

 @Column(nullable = false) private String name;
 @Column(nullable = false) private String symbol;

}
