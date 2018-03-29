package com.company;

public class Closet {
    public int clothes;
    public int hangers;

    public Closet(int clothes, int hangers) {
        this.clothes = clothes;
        this.hangers = hangers;
    }

    public void addClothers(int numberOfClothers) {
        if (this.hangers > this.clothes && numberOfClothers <= this.hangers) {
            this.clothes += numberOfClothers;
            System.out.println("current amount of clothes " + this.clothes);
        } else {
            System.out.println("not enough hangers");
        }
    }

    public int getClothes() {
        return clothes;
    }

    public int getHangers() {
        return hangers;
    }
}
