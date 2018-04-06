package com.company;


public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");

        if (bank.addBranch("West Road")) {
            System.out.println("West Road branch already created");
        }
        bank.addBranch("West Road");
        bank.addCustomer("West Road", "Kevin", 145);
        bank.addCustomer("West Road", "John", 145);
        bank.addCustomer("West Road", "Richard", 145);

        bank.addBranch("290 and Hollister");
        bank.addCustomer("290 and Hollister", "Melvin", 145);
        bank.addCustomer("290 and Hollister", "Jordan", 145);
        bank.addCustomer("290 and Hollister", "Alex", 145);

        bank.listCustomers("290 and Hollister",true);
        bank.listCustomers("West Road", true);

        bank.addBranch("Houston");
        if(!bank.addCustomer("Houston", "Ryan", 5.33)) {
            System.out.println("Error Houston does not exist");
        }

        if(!bank.addBranch("West Road")) {
            System.out.println("West Road already exists");
        }

        if(!bank.addCustomerTransaction("West Road", "Drake", 2000)) {
            System.out.println("Customer Drake does not exist");
        }

        if(!bank.addCustomer("WestRoad", "Kevin", 12.21)) {
            System.out.println("Customer Kevin Already exists");
        }



    }

}
