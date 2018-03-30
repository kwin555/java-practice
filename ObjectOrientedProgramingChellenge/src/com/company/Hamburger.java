package com.company;

public class Hamburger {
    private Breadroll breadroll;
    private Lettuce lettuce;
    private Meat meat;
    private Tomatoe tomatoe;
    private Bacon bacon;
    private Cheese cheese;
    private String name;

    public Hamburger(Breadroll breadroll, Lettuce lettuce, Meat meat, Tomatoe tomatoe, Bacon bacon, Cheese cheese, String name) {
        this.breadroll = breadroll;
        this.lettuce = lettuce;
        this.meat = meat;
        this.tomatoe = tomatoe;
        this.bacon = bacon;
        this.cheese = cheese;
        this.name = name;
    }

    public double priceOfBurger (Lettuce lettuce, Tomatoe tomatoe, Bacon bacon, Cheese cheese) {
        double basePrice = 3.00;
        System.out.println("Meat and Bread roll are added, current total: " + basePrice);
        basePrice = (lettuce.getLettuceType()) ? basePrice += .50 : basePrice;
        if (lettuce.getLettuceType()) {
            System.out.println("Lettuce is added for .50 cents, current total " + basePrice);
        }
        basePrice = (tomatoe.getTomatoePresent()) ? basePrice += .50 : basePrice;
        if (tomatoe.getTomatoePresent()) {
            System.out.println("tomatoe is added for .50 cents, current total " + basePrice);
        }
        basePrice = (bacon.getBaconType()) ? basePrice += .50 : basePrice;
        if (bacon.getBaconType()) {
            System.out.println("bacon is added for .50 cents, current total " + basePrice);
        }
        basePrice = (cheese.getCheesePresent()) ? basePrice += .50 : basePrice;
        if (cheese.getCheesePresent()) {
            System.out.println("cheese is added for .50 cents, current total " + basePrice);
        }
        System.out.println("The grand total is " + basePrice);
        return basePrice;
    }
}
