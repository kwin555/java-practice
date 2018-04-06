package com.codewarskata;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVist = new LinkedList<String>();

        addInOrder(placesToVist,"Sydney");
        addInOrder(placesToVist,"Melbourne");
        addInOrder(placesToVist,"Brisbane");
        addInOrder(placesToVist,"Perth");
        addInOrder(placesToVist,"Canberra");
        addInOrder(placesToVist,"Adelaide");
        addInOrder(placesToVist,"Darwin");



        printList(placesToVist);

        addInOrder(placesToVist,"Alice Springs");
        addInOrder(placesToVist,"Darwin");
        printList(placesToVist);
        visit(placesToVist);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext() )
        {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0) {
                //equal do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                //new city should appear before this one
                //brisbane -> adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingFoward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) {
            System.out.println("No  cities in the itenerary");
        } else {
            System.out.println("Now Visiting " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Holiday (vaction) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingFoward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingFoward = true;
                    }
                   if(listIterator.hasNext()) {
                       System.out.println("Now Visiting " + listIterator.next());
                   } else {
                       System.out.println("Reached the end of the list");
                       goingFoward = false;
                   }
                   break;
                case 2:
                    if(goingFoward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingFoward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We at the start of the list");
                        goingFoward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available action: \npress ");
        System.out.println("0 - to quit\n" +
            "1 - go to next city\n" +
            "2 - go to previous city\n" +
            "3 - print");
    }
}







