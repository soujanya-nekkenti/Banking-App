package com.model.bean;

public class CreditCard {
    private String creditCardNumber;
    private String nameOnTheCard;

    /**
     * @return the creditCardNumber
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber
     *            the creditCardNumber to set
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * @return the nameOnTheCard
     */
    public String getNameOnTheCard() {
        return nameOnTheCard;
    }

    /**
     * @param nameOnTheCard
     *            the nameOnTheCard to set
     */
    public void setNameOnTheCard(String nameOnTheCard) {
        this.nameOnTheCard = nameOnTheCard;
    }
}
