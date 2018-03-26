package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is "+ newScore);
//        calculateScore(300);
//        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(2,6) + "cm");
        System.out.println(calcFeetAndInchesToCentimeters(-10) + "cm");
    }
    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Unnamed Player " + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore () {
        System.out.println("No Player name, no points.");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double conversionFactor = 2.54;
        double convertFeetToInches = feet * 12;
        if (feet >=0 && (inches >=0 && inches <= 12))
        {
            return (convertFeetToInches + inches) * conversionFactor;
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = inches / 12.0;
            return calcFeetAndInchesToCentimeters(feet,0);
        } else {
            return -1;
        }
    }
}
