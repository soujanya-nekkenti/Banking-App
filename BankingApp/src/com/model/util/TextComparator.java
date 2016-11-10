package com.model.util;

import java.util.Comparator;

import com.model.bean.BankTransactions;

public class TextComparator implements Comparator<BankTransactions> {

    public int compare(BankTransactions bt1, BankTransactions bt2) {
        return bt1.getText().compareTo(bt2.getText());
    }

}
