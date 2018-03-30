package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.name = "Kevin";
//        player.health = 20;
//        player.weapon= "SWord";
//
//        int  damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 10;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Kevin", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer (50, true);
        System.out.println("initial page count  = " + printer.getNumberOfPages());
        int pagesPritned = printer.printPages(25);
        System.out.println("Pages printed was : " + pagesPritned + " new total print count for printer = " + printer.getNumberOfPages());
        pagesPritned = printer.printPages(2);
        System.out.println("Pages printed was : " + pagesPritned + " new total print count for printer = " + printer.getNumberOfPages());

    }
}
