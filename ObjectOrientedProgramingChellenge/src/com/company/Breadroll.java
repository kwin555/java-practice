package com.company;

public class Breadroll {
    private String rollType;
    private boolean rollPresent;

    public Breadroll(String rollType) {
        this.rollType = rollType;
        this.rollPresent = true;
    }

    public String getRollType() {
        return rollType;
    }
    public boolean getRollPresent() {
        return this.rollPresent;
    }
}
