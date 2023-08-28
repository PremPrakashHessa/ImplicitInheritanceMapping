package com.example.implicitinheritancemapping.enitities.repositories;

import com.example.implicitinheritancemapping.enitities.hierarchy.CreditCard;

import java.util.List;

public interface CreditCardRepository extends BillingInfoRepository<CreditCard,Long> {

    List<CreditCard> findCreditCardByCreditCardNumber(Long creditCardNumber);
    List<CreditCard> findCreditCardsByCreditLimitIsGreaterThan(double creditLimit);
}