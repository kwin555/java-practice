package com.company;

public class DeluxeHamburger extends Hamburger {
    private boolean frys;
    private boolean drink;

    public DeluxeHamburger(boolean frys, boolean drink, Breadroll breadroll, Lettuce lettuce, Meat meat, Tomatoe tomatoe, Bacon bacon, Cheese cheese, String name) {
        super(breadroll, lettuce, meat, tomatoe, bacon, cheese, name);
        breadroll = new Breadroll("Brown rye bread roll");
        this.frys = frys;
        this.drink = drink;
    }

    @Override
    public double priceOfBurger (Lettuce lettuce, Tomatoe tomatoe, Bacon bacon, Cheese cheese) {
        double basePrice = 5.00;
        System.out.println("Meat, Bread roll, chips and drink are added, current total: " + basePrice);
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
            System.out.println("Lettuce is added for .50 cents, current total " + basePrice);
        }
        basePrice = (cheese.getCheesePresent()) ? basePrice += .50 : basePrice;
        if (cheese.getCheesePresent()) {
            System.out.println("Lettuce is added for .50 cents, current total " + basePrice);
        }
        System.out.println("The grand total is " + basePrice);
        return basePrice;
    }
}
