package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //width of an int is 32 bytes
        int myIntValue = 5 / 3;
        //width of an float 32 bytes
        float myFloatValue =  5f / 3f;
        //width of double = 64
        double myDoubleValue = 5d / 3d;

        double pounds = 200d;
        double kilogram = pounds * 0.45359237d;

        double pi = 3.141_592_7d;


        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatvalue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("pounds: " + pounds + " is "+ kilogram + "kg.");

    }
}
