package com.testsuites;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.model.bean.BankTransactions;
import com.model.dao.BankAccountDao;

public class PositiveTransactionsTestSuite {

    @Test
    public void testPositiveTransactions() {
        System.out.println("Test Positive Transactions...");

        ArrayList<BankTransactions> positiveBankTransList = new BankAccountDao().getPositiveAmountDetails();
        for (BankTransactions pbt : positiveBankTransList) {
            Assert.assertTrue("Still having positive values ... ", pbt.getAmount() < 0);
            break;
        }
    }
}
