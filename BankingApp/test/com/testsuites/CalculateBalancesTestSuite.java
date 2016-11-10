package com.testsuites;

import org.junit.Assert;
import org.junit.Test;

import com.model.dao.BankAccountDao;

public class CalculateBalancesTestSuite {
    
    @Test
    public void calculateBankAccountAmount() {
        System.out.println("Calculating Bank Account Amount...");
        Assert.assertEquals(new Double(190.00), new BankAccountDao().calculateAmount("BankAccount"));
    }

    @Test
    public void calculateCreditCardAmount() {
        System.out.println("Calculating Credit Card Amount...");
        Assert.assertEquals(new Double(289.00), new BankAccountDao().calculateAmount("CreditCard"));
    }
}
