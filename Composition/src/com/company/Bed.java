package com.company;


public class Bed {
    private int sheets;
    private int blankets;
    private int mattress;
    private int pillows;
    private boolean isClean;

    public Bed(int sheets, int blankets, int mattress, int pillows, boolean isClean) {
        this.sheets = sheets;
        this.blankets = blankets;
        this.mattress = mattress;
        this.pillows = pillows;
        this.isClean = isClean;
    }

    public void makeBed(int x, int y, Folded fold) {
        System.out.println("Bed has been made, pillows are at " + x + " and " + y);
    }

    public int getSheets() {
        return sheets;
    }

    public int getBlankets() {
        return blankets;
    }

    public int getMattress() {
        return mattress;
    }

    public int getPillows() {
        return pillows;
    }

    public boolean isClean() {
        return isClean;
    }
}
