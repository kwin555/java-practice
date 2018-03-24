package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //  byte
        //short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String  myString = "This is a string";
        System.out.println("myString: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString: " + myString);
        myString = myString + " \u00AE";
        System.out.println("myString: " + myString);

        String numberString = "235.334";
        numberString = numberString + "49.95";
        System.out.println("numberString: " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
    }
}
