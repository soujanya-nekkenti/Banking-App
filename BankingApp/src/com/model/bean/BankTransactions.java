package com.model.bean;

import java.util.Date;

public class BankTransactions {
    private Date transDate;
    private String text;
    private String bankEventType;
    private String recipientNumber;
    private Double amount;
    private String timeInterval;

    public BankTransactions(Date transDate, String text, String bankEventType, String recipientNumber, Double amount) {
        this.transDate = transDate;
        this.text = text;
        this.bankEventType = bankEventType;
        this.recipientNumber = recipientNumber;
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
     * @return the recipientNumber
     */
    public String getRecipientNumber() {
        return recipientNumber;
    }

    /**
     * @param recipientNumber
     *            the recipientNumber to set
     */
    public void setRecipientNumber(String recipientNumber) {
        this.recipientNumber = recipientNumber;
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

    /**
     * @return the timeInterval
     */
    public String getTimeInterval() {
        return timeInterval;
    }

    /**
     * @param timeInterval
     *            the timeInterval to set
     */
    public void setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
    }
}
