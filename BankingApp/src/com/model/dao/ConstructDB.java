package com.model.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import com.model.bean.BankAccount;
import com.model.bean.BankTransactions;
import com.model.bean.CreditCard;
import com.model.bean.CreditCardTransactions;

public class ConstructDB {
    private static HashMap dataMap;
    private static ConstructDB constructDB;

    private ConstructDB() {
        if (dataMap == null) {
            dataMap = new HashMap();
            setUpData(dataMap);
        }
    }

    private void setUpData(HashMap dataMap) {

        BankAccount ba = new BankAccount();
        ba.setNumber(10201);
        ba.setOwner("Jonas");
        dataMap.put("BankAccount", getAllBankTransactions());

        CreditCard cc = new CreditCard();
        cc.setCreditCardNumber("1234123412341234");
        cc.setNameOnTheCard("Jonas");
        dataMap.put("CreditCard", getAllCreditCardTransactions());
    }

    public static ConstructDB getInstance() {
        if (constructDB == null) {
            constructDB = new ConstructDB();
        }
        return constructDB;
    }

    private ArrayList<BankTransactions> getAllBankTransactions() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<BankTransactions> bankTransList = new ArrayList<BankTransactions>();
        try {
            bankTransList.add(new BankTransactions(sdf.parse("2016-08-01"), "Gym", "Payment", "123-456", -200.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-07-23"), "Video streaming ", "Transaction", "", -99.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-07-18"), "Gym", "Payment", "123-456", -200.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-07-04"), "Gym", "Payment", "123-456", -200.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-06-28"), "Gym", "Payment", "123-456", -50.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-06-25"), "Salary", "Transaction", "", 1337.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-06-22"), "Video streaming ", "Transaction", "", -99.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-06-20"), "Gym", "Payment", "123-456", -200.0));
            bankTransList.add(new BankTransactions(sdf.parse("2016-05-23"), "Video streaming ", "Transaction", "", -99.0));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return bankTransList;
    }

    private ArrayList<CreditCardTransactions> getAllCreditCardTransactions() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<CreditCardTransactions> ccTransList = new ArrayList<CreditCardTransactions>();
        try {
            ccTransList.add(new CreditCardTransactions(sdf.parse("2016-08-01"), "Pizza", "Credit card transaction ", 70.0));
            ccTransList.add(new CreditCardTransactions(sdf.parse("2016-07-27"), "Bar", "Credit card transaction ", 120.0));
            ccTransList.add(new CreditCardTransactions(sdf.parse("2016-07-20"), "Grocery store", "Credit card transaction ", 99.0));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return ccTransList;
    }

    /**
     * @return the dataMap
     */
    public static HashMap getDataMap() {
        return dataMap;
    }
}
