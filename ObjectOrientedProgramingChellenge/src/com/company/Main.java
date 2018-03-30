package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Breadroll breadroll = new Breadroll("white");
        Lettuce lettuce = new Lettuce(true);
        Bacon bacon = new Bacon(false);
        Tomatoe tomatoe = new Tomatoe(true);
        Cheese cheese = new Cheese(true);
        Meat meat = new Meat();
        HealthHamburger hamburger = new HealthHamburger(false, false,breadroll,lettuce, meat,tomatoe, bacon, cheese, "The Works");
        hamburger.priceOfBurger(lettuce,tomatoe,bacon,cheese);
    }
}
