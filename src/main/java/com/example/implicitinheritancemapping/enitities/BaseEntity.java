package com.example.implicitinheritancemapping.enitities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import java.time.Instant;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "CREATED_DATE" , updatable = false)
    @CreationTimestamp
    private Instant created_date;


    @Column(name = "updated_date" , insertable = false)
    @UpdateTimestamp
    private Instant updated_date;

}
