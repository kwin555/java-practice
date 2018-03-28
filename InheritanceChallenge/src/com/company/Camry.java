package com.company;

public class Camry extends Car {
    private int fuelEconomy;
    private boolean airBag;
    private double price;

    public Camry(int fuelEcnomy, boolean airBag, double price) {
        super("Camry",1);
        this.fuelEconomy = fuelEcnomy;
        this.airBag = airBag;
        this.price = price;
    }


    }
}
