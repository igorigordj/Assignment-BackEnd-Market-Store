package com.primeHolding;

public abstract class DiscountCard {

    //CARD OWNER INFO
    protected Person cardOwner;

    //REPRESENTS PURCHASE TURNOVER FOR PREVIOUS MONTH
    protected double turnover;

    //INITIAL DISCOUNT RATE
    protected double discountRate;


    //CONSTRUCTORS
    public DiscountCard() {
    }

    public DiscountCard(double discountRate) {
        this.discountRate = discountRate;
    }

    public DiscountCard(Person cardOwner, double turnover) {
        this.cardOwner = cardOwner;
        this.turnover = turnover;

    }


    //GETTERS & SETTERS
    public Person getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(Person cardOwner) {
        this.cardOwner = cardOwner;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {

        this.discountRate = discountRate;
    }

    //METHOD THAT CALCULATES DISCOUNT RATE OF CURRENT PURCHASE
    protected double calculateDiscountRate(double purchaseValue, double discountRate){
        double discount = purchaseValue * discountRate/100;

        return discount;
    }

    @Override
    public String toString() {
        return "DiscountCard: " +
                "\ncardOwner: " + cardOwner +
                "\nturnover: " + turnover +
                "\ndiscount: " + discountRate;
    }
}



