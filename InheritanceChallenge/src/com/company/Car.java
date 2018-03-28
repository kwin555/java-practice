package com.company;

public class Car extends Vehicle {
    private int gear;

    public Car(String name, int gear) {
        super("north","default name");
        this.gear = gear;
    }

    public int getGear() {
        return this.gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void slowDown() {
        if (gear >=1 ) {
            System.out.println("Shifting down one gear");
            this.gear -= 1;
            System.out.println("Current gear: " + this.gear);
            super.decreasespeed(2);
            System.out.println("Your current speed it: " +super.getSpeed());
        } else if (gear == 0) {
            System.out.println("Car not in motion");
        } else {
            System.out.println("broken gear box, take to the shop");
        }
    }

    public void speedUp() {
        if(gear < 0) {
            System.out.println("shift up one gear");
            this.gear++;
            System.out.println("Current gear: " + this.gear);
            super.increaseSpped(5);
            System.out.println("Current speed: " + super.getSpeed());
        }


    }

    public void stop() {
        super.setSpeed(0);
    }
}
