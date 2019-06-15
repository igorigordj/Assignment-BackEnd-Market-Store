package com.primeHolding;

public class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Igi Dj", "ul. Bula Bula 15", "igidj@mail.com",
                new BronzeDiscountCard(3.5), 300);

        Client client2 = new Client("Miss Piggy", "Ivory St.", "missp@mail.com",
                new SilverDiscountCard(2), 500);

        Client client3 = new Client("Twitty Bird", "Milenium St.", "twitter@mail.com",
                new GoldDiscountCard(8), 1800);


        PayDesk payDesk = new PayDesk();

        payDesk.purchase(client1, 150);
        System.out.println();

        payDesk.purchase(client2, 1300);
        System.out.println();

        payDesk.purchase(client3, 550);


    }

}
