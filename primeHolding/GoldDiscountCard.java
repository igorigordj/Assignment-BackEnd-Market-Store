package com.primeHolding;

public class GoldDiscountCard extends DiscountCard {

    private double discountRate;

    public GoldDiscountCard(double discountRate) {
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {

        if (turnover >= 100 && turnover <= 200) {
            this.discountRate = 3.0;
        } else if (turnover > 200 && turnover <= 300) {
            this.discountRate = 4.0;
        } else if (turnover > 200 && turnover <= 300) {
            this.discountRate = 5.0;
        } else if (turnover > 300 && turnover <= 400) {
            this.discountRate = 6.0;
        } else if (turnover > 400 && turnover <= 500) {
            this.discountRate = 7.0;
        } else if (turnover > 500 && turnover <= 600) {
            this.discountRate = 8.0;
        } else if (turnover > 700 && turnover <= 800) {
            this.discountRate = 9.0;
        } else if (turnover > 800) {
            this.discountRate = 10.0;
        } else {
            //DEFAULT DISCOUNT RATE
            this.discountRate = 2;
        }
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }
}
