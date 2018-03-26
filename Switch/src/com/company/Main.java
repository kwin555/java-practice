package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("alue was 2");
        } else {
            System.out.println(" was not 1 or 2");
        }
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;

        }
        char charSwitchValue = 'E';
        switch (charSwitchValue) {
            case 'A': case 'B':case 'C':case'D': case'E':
                System.out.println(charSwitchValue + " was found!");
                break;
            default:
                System.out.println("character was not found");
                break;
        }

        String mondth = "January";
        switch(mondth.toLowerCase()) {
            case "January": case "February": case "March":
                System.out.println(mondth + " was found");
                break;
            default:
                System.out.println("month was not found");
                break;
        }
    }
}
