package com.example.implicitinheritancemapping.enitities.resources;

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

    @Qualifier("bankDetailsRepository")
    @Autowired BillingInfoRepository bankRepo;

    @Qualifier("creditCardRepository")
    @Autowired BillingInfoRepository creditRepo;


    @GetMapping("/invoke")
    public void invokeFindAll(){
        repository.findAll();
    }

    @GetMapping("/invokeCredit")
    public void invokeCredit(){
        creditRepo.findAll();
    }

    @GetMapping("/invokeBank")
    public void invokeBank(){
        bankRepo.findAll();
    }
}
