package com.model.util;

import java.util.Comparator;

import com.model.bean.BankTransactions;

public class DateComparator implements Comparator<BankTransactions> {

    public int compare(BankTransactions bt1, BankTransactions bt2) {
        return bt1.getTransDate().compareTo(bt2.getTransDate());
    }

}
