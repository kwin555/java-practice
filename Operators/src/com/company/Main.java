package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println(" 1 + 2 = " + result );
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + "  * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        boolean isAlien = false;
        if (isAlien == true)
        {
            System.out.println("It is not an alien.");
        }

        int topScore = 80;

        if (topScore <= 100)
        {
            System.out.println("You got the high Score");
        }

        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore < 100)
        {
            System.out.println("Greater than second top score and less than 100");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        {
            System.out.println("was car is true");
        }

        double num = 20d;
        double num2 = 80d;
        double total = (num + num2) * 25d;
        System.out.println(total);
        double mod = total % 40;
        if (mod <= 20)
        {
            System.out.println("Total was over the limit");
        }


    }
}
