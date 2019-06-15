package com.primeHolding;

public class PayDesk {

    public static void purchase(Client client, double purchaseValue){
        double discount = client.getDiscountCard().calculateDiscountRate(purchaseValue, client.getDiscountCard().getDiscountRate());
        System.out.println("Purchase value: $" + purchaseValue);
        System.out.println("Discount rate: " + client.getDiscountCard().getDiscountRate() + "%");
        System.out.println("Discount: $" + discount);
        System.out.println("Total: $" + (purchaseValue - discount));
    }


}
