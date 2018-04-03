package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner((System.in));
    private static GroceryLIst groceryList = new GroceryLIst();
    public static void main(String[] args) {
        boolean quit = false;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }
    }
    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 To print the choice options.");
        System.out.println("\t 1 To print the list of grocery items.");
        System.out.println("\t 2 To add an item to the list.");
        System.out.println("\t 3 To modify an item to the list.");
        System.out.println("\t 4 To remove an item from the list.");
        System.out.println("\t 5 To search for  an item in the list.");
        System.out.println("\t 6 To quit the app.");
    }

    public  static void addItem() {
        System.out.println("Please enter the grocery Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current Item name: ");
        String item = scanner.nextLine();
        scanner.nextLine();
        System.out.println("New Item name: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item,newItem);
    }

    public static void removeItem()
    {
        System.out.println("Item: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the grocery list.");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
