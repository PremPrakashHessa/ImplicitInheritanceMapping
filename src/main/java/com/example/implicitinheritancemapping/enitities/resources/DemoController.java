package com.example.implicitinheritancemapping.enitities.resources;

import com.example.implicitinheritancemapping.enitities.User;
import com.example.implicitinheritancemapping.enitities.hierarchy.BankDetails;
import com.example.implicitinheritancemapping.enitities.hierarchy.BillingInfo;
import com.example.implicitinheritancemapping.enitities.hierarchy.CreditCard;
import com.example.implicitinheritancemapping.enitities.repositories.BillingInfoRepository;
import com.example.implicitinheritancemapping.enitities.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.HashSet;
import java.util.Set;

@RestController
public class DemoController {

    @Qualifier("billingInfoRepository")
    @Autowired
    BillingInfoRepository billingInfoRepo;

    @Autowired
    UserRepository userRepo;

    @GetMapping("/setDefault")
    public void setDefaultBillingInfo(){
        User u = new User();
        u.setUsername("Prem Prakash");
        CreditCard card = new CreditCard();
        card.setCreditCardNumber(12345678);
        card.setOwner("Prem Prakash");
        card.setExpiryMonth(YearMonth.of(2003, Month.JANUARY));
        card.setExpiryYear(Year.now());


        u.setDefaultBillinginfo(card);

        userRepo.save(u);
    }

    @GetMapping("/getDefaultBillingInfo")
    public String getDefaultBillingInfo(){

        User premPrakash = userRepo.findByUsername("Prem Prakash");
        BillingInfo defaultBillinginfo = premPrakash.getDefaultBillinginfo();
        return defaultBillinginfo.toString();
    }

    @GetMapping("/settingMultipleBillingDetails")
    public void setMultipleBillingInfo()
    {
        User u = new User();
        u.setUsername("Prem Prakash");

        CreditCard card = new CreditCard();
        card.setCreditCardNumber(12345678);
        card.setOwner("Prem Prakash");
        card.setExpiryMonth(YearMonth.of(2003, Month.JANUARY));
        card.setExpiryYear(Year.now());

        BankDetails details = new BankDetails();
        details.setOwner("Prem Prakash");
        details.setSwift("SWIFT");
        details.setAccountNumber(1234578);
        details.setUser(null);
        details.setBankName("JP Morgan");

        Set<BillingInfo> infos = new HashSet<>();
        infos.add(card);
        infos.add(details);

        u.setBillingInfos(infos);


        userRepo.save(u);

    }

    @GetMapping("/getAllBillingInfo")
    public String getAllBillingInfo()
    {
        User premPrakash = userRepo.findByUsername("Prem Prakash");
        Set<BillingInfo> billingInfos = premPrakash.getBillingInfos();
        return billingInfos.toString();
    }
}
