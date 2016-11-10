package com.testsuites;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.model.bean.BankTransactions;
import com.model.dao.BankAccountDao;

public class TimeIntervalTestSuite {

    @Test
    public void testBiweeklyEvents() {
        System.out.println("Test Biweekly Events...");

        ArrayList<BankTransactions> biweeklyEventsList = new BankAccountDao().getBiweeklyEvents();
        for (BankTransactions bet : biweeklyEventsList) {
            Assert.assertEquals("Biweekly", bet.getTimeInterval());
            break;
        }
    }

    @Test
    public void testMonthlyEvents() {
        System.out.println("Test Monthly Events...");

        ArrayList<BankTransactions> monthlyEventsList = new BankAccountDao().getMonthlyEvents();
        for (BankTransactions bet : monthlyEventsList) {
            Assert.assertEquals("Monthly", bet.getTimeInterval());
            break;
        }
    }
}
