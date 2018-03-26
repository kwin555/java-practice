package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("10000 at "+ i + " % interest = " +
                    String.format("%.2f",calculateInterest(10000, i)));
        }
        System.out.println("\n");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10000 at "+ i + " % interest = " +
                    String.format("%.2f",calculateInterest(10000, i)));
        }
        int counter = 0;
        for ( int i = 2; i < 100; i++)
        {
            if (isPrime(i)) {
                counter++;
                if (counter <=10) {
                    System.out.println("A Prime number is " + i);
                }
            }
        }


    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
