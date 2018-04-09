package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(showSequence(6));
    }
    public static String showSequence(int value){
        if (value < 0) return value + "<0";
        if (value == 0) return value + "=0";
        String output = "0";
        int sum = 0;
        for(int i = 1; i <= value; i++) {
            output += "+" + i;
            sum += i;
        }
        return output + " = " + sum;
    }
}
