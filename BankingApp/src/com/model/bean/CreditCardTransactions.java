package com.model.bean;

import java.util.Date;

public class CreditCardTransactions {
    private Date transDate;
    private String text;
    private String bankEventType;
    private Double amount;

    public CreditCardTransactions(Date transDate, String text, String bankEventType, Double amount) {
        this.transDate = transDate;
        this.text = text;
        this.bankEventType = bankEventType;
        this.amount = amount;
    }

    /**
     * @return the transDate
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * @param transDate
     *            the transDate to set
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     *            the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the bankEventType
     */
    public String getBankEventType() {
        return bankEventType;
    }

    /**
     * @param bankEventType
     *            the bankEventType to set
     */
    public void setBankEventType(String bankEventType) {
        this.bankEventType = bankEventType;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount
     *            the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
