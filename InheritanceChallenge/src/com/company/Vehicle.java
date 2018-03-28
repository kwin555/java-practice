package com.company;

public class Vehicle {
    private int speed;
    private String steering;
    private String name;

    public Vehicle(String name) {
        this(45, "north", name);
    }

    public Vehicle(String steering,String name) {
        this(45, steering, name);
    }

    public Vehicle(int speed, String steering, String name) {
        this.speed = speed;
        this.steering = steering;
        this.name = name;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSteering() {
        return this.steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void increaseSpped (int speedIncrease) {
        this.speed += speedIncrease;
        System.out.println("Your current speed it " + this.speed + " speed units.");
    }
    public void decreasespeed (int speedDecrease) {
        if(this.speed < speedDecrease) {
            this.speed = 0;
        } else {
            this.speed -= speedDecrease;
        }
    }
}
