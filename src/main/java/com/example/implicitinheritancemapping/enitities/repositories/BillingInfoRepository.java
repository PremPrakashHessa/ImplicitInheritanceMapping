package com.example.implicitinheritancemapping.enitities.repositories;

import com.example.implicitinheritancemapping.enitities.hierarchy.BillingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;


public interface BillingInfoRepository<T extends BillingInfo,Long> extends JpaRepository<T, Long> {

    List<T> findByOwner(String owner);
}