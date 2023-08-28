package com.example.implicitinheritancemapping.enitities.repositories;

import com.example.implicitinheritancemapping.enitities.hierarchy.BankDetails;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;


public interface BankDetailsRepository extends BillingInfoRepository<BankDetails,Long> {

    List<BankDetails> findBankAccountByAccountNumber(Long accountNumber);
    List<BankDetails> findBankAccountsBySwift(String swift);
}