package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        if(sum % 2 == 0) return "even";
        return "odd";
    }
}
