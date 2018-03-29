package com.company;

public class EnhancedPlayer {
    private String name;
    private int hitpoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hitpoints, String weapon) {
        this.name = name;
        if (hitpoints > 0 && hitpoints <= 100) {
            this.hitpoints = hitpoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoints -= damage;
        if(this.hitpoints <= 0) {
            System.out.println("Player is knocked out. Game Over");
        }
    }

    public int getHealth() {
        return this.hitpoints;
    }


}
