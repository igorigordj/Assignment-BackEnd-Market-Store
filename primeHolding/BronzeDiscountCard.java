package com.primeHolding;

public class BronzeDiscountCard extends DiscountCard {
    private double discountRate;

    public BronzeDiscountCard(double discountRate) {

        this.discountRate = discountRate;
    }


    public void setDiscountRate(double discountRate) {
        if (turnover < 100){
            this.discountRate = 0;
        }
        else if (turnover >= 100 && turnover <=300){
            this.discountRate = 1;
        }
        else {
            this.discountRate = 2.5;
        }
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
