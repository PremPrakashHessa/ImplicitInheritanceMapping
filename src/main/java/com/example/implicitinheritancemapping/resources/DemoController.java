package com.example.implicitinheritancemapping.resources;

import com.example.implicitinheritancemapping.enitities.repositories.BillingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Qualifier("billingInfoRepository")
    @Autowired
    BillingInfoRepository repository;

    @GetMapping("/invoke")
    public void invokeFindAll()
    {

        repository.findAll();
    }
}
