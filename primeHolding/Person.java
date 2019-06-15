package com.primeHolding;

public abstract class Person {
    protected String name;
    protected String address;
    protected String email;

    protected DiscountCard discountCard;

    //CONSTRUCTOR FOR PERSON THAT DOES NOT HAVE DISCOUNT CARD
    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    //CONSTRUCTOR FOR PERSON THAT HAS DISCOUNT CARD
    public Person(String name, String address, String email, DiscountCard discountCard) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.discountCard = discountCard;
    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    //DISPLAYS CARD OWNER INFO
    @Override
    public String toString() {
        return "Person Info: " +
                "\nname: " + name +
                "\naddress: " + address +
                "\nemail: " + email;
    }
}
