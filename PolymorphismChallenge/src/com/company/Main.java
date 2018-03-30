package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    private int steeringWheel;
    private int seats;
    private String name;

    public Car(int cylinders, int doors, int seats, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
        this.steeringWheel = 1;
        this.seats = seats;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }

    public String getName() {
        return name;
    }

    public String openDoor() {
        return "Open all four doors";
    }

    public String accelerate() {
        return "I am accelerating pretty fast";
    }

    public String breaking() {
        return "The Car is breaking pretty hard.";
    }


}

class Camery extends Car {
    public Camery() {
        super(4, 4, 5, "Camry");
    }
    @Override
    public String accelerate() {
        return "I am accelerating pretty slow";
    }

    public String breaking() {
        return "The Car is breaking pretty slow.";
    }

}

class LFA extends Car {
    public LFA() {
        super(12, 2, 2, "LFA");
    }

    @Override
    public String openDoor() {
        return "Open all 2 doors";
    }
}

class GX560 extends Car {
    public GX560() {
        super(8, 2, 5, "GX560");
    }
    @Override
    public String accelerate() {
        return "I am accelerating pretty slow";
    }

}



public class Main {

    public static void main(String[] args) {
	// write your code here
        LFA lfa = new LFA();
        Camery camry = new Camery();
        System.out.println(camry.accelerate());
    }
}
