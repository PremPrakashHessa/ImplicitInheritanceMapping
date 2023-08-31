package com.example.implicitinheritancemapping.enitities.resources;

import com.example.implicitinheritancemapping.enitities.repositories.BillingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired @Qualifier("billingInfoRepository")
    BillingInfoRepository repository;

    @Qualifier("creditCardRepository")
    @Autowired
    BillingInfoRepository repository2;

    @GetMapping("/invoke")
    public void invokeFindAll()
    {
        repository.findAll();
    }

    @GetMapping("/invokeCredit")
    public void invokeCredit(){
        repository2.findAll();
    }
}
