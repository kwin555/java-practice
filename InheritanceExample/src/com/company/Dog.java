package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;
    public Dog(int size, int weight, String name, int eyes, int legs, int tails, int teeth, String Coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = Coat;
    }
    private void chew() {
        System.out.println("Dog.chew() called!");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called!");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs (int speed) {
        System.out.println("Dog.movelegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);

    }
}
