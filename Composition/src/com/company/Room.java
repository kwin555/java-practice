package com.company;

public class Room {
    private Bed bed;
    private Chair chair;
    private Closet closet;
    private Desk desk;

    public Room(Bed bed, Chair chair, Closet closet, Desk desk) {
        this.bed = bed;
        this.chair = chair;
        this.closet = closet;
        this.desk = desk;
    }

    public Desk getDesk() {
        return this.desk;
    }

    public void makeBed() {
        System.out.println("Bedroom --> making bed");
        bed.makeBed(4,5,new Folded(true));
    }
}
