package com.company;

public class Chair {
    private int elbowRests;
    private boolean isCusion;
    private int wheels;
    private int suspensionLevel;

    public Chair(int elbowRests, boolean isCusion, int wheels, int suspensionLevel) {
        this.elbowRests = elbowRests;
        this.isCusion = isCusion;
        this.wheels = wheels;
        this.suspensionLevel = suspensionLevel;
    }


    public void changeChairHeight(int leverLevel) {
        if (leverLevel > 0 ) {
            this.suspensionLevel += leverLevel;
            System.out.println("suspension level is now " + this.suspensionLevel);
        } else if ( leverLevel < this.suspensionLevel && this.suspensionLevel > 0) {
            this.suspensionLevel = this.suspensionLevel;
            this.suspensionLevel -= leverLevel;
            System.out.println("suspension level is now " + this.suspensionLevel);
        } else {
            System.out.println("suspension level is unchanged");
        }
    }

    public int getElbowRests() {
        return elbowRests;
    }

    public boolean isCusion() {
        return isCusion;
    }

    public int getWheels() {
        return wheels;
    }
}
