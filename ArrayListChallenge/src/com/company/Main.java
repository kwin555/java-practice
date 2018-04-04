package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("713 502 3083");

    public static void main(String[] args) {
        boolean quit = false;

        startphone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }
    private static void startphone() {
        System.out.println("Starting phone...");
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    private static void printActions() {
        System.out.println("\nAvaliable action\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove an existing contact\n" +
                           "5 - to  find out if an existing contact exisits\n" +
                           "6 - to print a list of available actions\n" );
        System.out.println("Choose your action: ");

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new Contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName,newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating error");
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Successfully deleteed");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void findContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getPhomeNumber());
    }
}
