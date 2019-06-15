package com.primeHolding;

public class SilverDiscountCard extends DiscountCard {

    private double discountRate;

    public SilverDiscountCard(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        if (turnover > 300){
            this.discountRate = 3.5;
        }
        else {
            this.discountRate = 2;
        }
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }
}
