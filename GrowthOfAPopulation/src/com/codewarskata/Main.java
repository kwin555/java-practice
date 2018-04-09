package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(nbYear(1500, 5, 100, 5000));
    }
    public static int nbYear(int initialPopulation, double percentGrowth, int populationMigrants, double target) {
        // your code
        int years = 0;
        while (initialPopulation < target) {
            initialPopulation +=  (int) (initialPopulation * (percentGrowth / 100)) + populationMigrants;
            years++;
        }
        return years;

    }
}
