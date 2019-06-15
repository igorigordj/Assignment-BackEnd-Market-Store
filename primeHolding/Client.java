package com.primeHolding;

public class Client extends Person {

    private double turnover;

    public Client(String name, String address, String email, DiscountCard discountCard, double turnover) {
        super(name, address, email);
        this.discountCard = discountCard;
        this.turnover = turnover;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }
}
