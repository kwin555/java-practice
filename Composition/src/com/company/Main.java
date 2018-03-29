package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220", "Dell", "240",dimensions);
        Monitor theMonitor = new Monitor("27 in", "Asus", 27, new Resolution(2560, 1440));
        Motherboard theMotherboard = new Motherboard("ROG", "Asus",4,4,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUp();

        Bed bed1 = new Bed(1,1,1,4,true);
        Chair chair1 = new Chair(2,true,4,3);
        Closet closet = new Closet(10,25);
        Desk desk = new Desk(4,"wood");

        Room bedroom = new Room(bed1,chair1,closet,desk);

        bedroom.makeBed();
        bedroom.chaange
    }
}
