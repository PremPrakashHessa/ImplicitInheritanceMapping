package com.example.implicitinheritancemapping.resources;

import com.example.implicitinheritancemapping.enitities.repositories.BillingInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Qualifier("creditCardRepository")
    @Autowired
    BillingInfoRepository repository;

    @Qualifier("bankDetailsRepository")
    @Autowired BillingInfoRepository repo2;

    @GetMapping("/invoke")
    public void invokeBillingInfoRepoFindAll(){
        repository.findAll();
        repo2.findAll();
    }
}
