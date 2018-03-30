package com.company;

public class HealthHamburger extends Hamburger {
    private boolean kaleSalad;
    private boolean smoothie;

    public HealthHamburger(boolean kaleSalad, boolean smoothie, Breadroll breadroll, Lettuce lettuce, Meat meat, Tomatoe tomatoe, Bacon bacon, Cheese cheese, String name) {
        super(breadroll, lettuce, meat, tomatoe, bacon, cheese, name);
        breadroll = new Breadroll("Brown rye bread roll");
        this.kaleSalad = kaleSalad;
        this.smoothie = smoothie;
    }

    @Override
    public double priceOfBurger (Lettuce lettuce, Tomatoe tomatoe, Bacon bacon, Cheese cheese) {
        double basePrice = 3.00;
        System.out.println("Meat and Bread roll are added, current total: " + basePrice);
        basePrice = (lettuce.getLettuceType()) ? basePrice += .50 : basePrice;
        if (lettuce.getLettuceType()) {
            System.out.println("Lettuce is added for .50 cents, current total " + basePrice);
        }
        basePrice = (tomatoe.getTomatoePresent()) ? basePrice += .50 : basePrice;
        if (tomatoe.getTomatoePresent()) {
            System.out.println("tomato is added for .50 cents, current total " + basePrice);
        }
        basePrice = (bacon.getBaconType()) ? basePrice += .50 : basePrice;
        if (bacon.getBaconType()) {
            System.out.println("bacon is added for .50 cents, current total " + basePrice);
        }
        basePrice = (cheese.getCheesePresent()) ? basePrice += .50 : basePrice;
        if (cheese.getCheesePresent()) {
            System.out.println("cheese is added for .50 cents, current total " + basePrice);
        }
        basePrice = (this.kaleSalad) ? basePrice += 1.00 : basePrice;
        if (this.kaleSalad) {
            System.out.println("Kale Salad is added for 1.00 cents, current total " + basePrice);
        }
        basePrice = (this.smoothie) ? basePrice += 1.50 : basePrice;
        if (this.smoothie) {
            System.out.println("smoothie is added for 1.50 cents, current total " + basePrice);
        }
        System.out.println("The grand total is " + basePrice);
        return basePrice;
    }
}
