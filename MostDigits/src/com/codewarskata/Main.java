package com.codewarskata;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[] {-556487956, -1476200375, 8, -3 ,11};
        System.out.println(findLongest(numbers));
    }
    public static int findLongest(int[] numbers) {
        int mostDigits = 0;
        int longest = 0;
        int currentLength = 0;

        for (int i = 0; i < numbers.length; i++){
            boolean wasNeg = false;
            if (numbers[i] < 0){
                numbers[i] *= -1;
                wasNeg = true;
            }

            currentLength = String.valueOf(numbers[i]).length();

            if (currentLength > longest){
                longest = currentLength;
                if (wasNeg == true){
                    numbers[i] *= -1;
                }
                mostDigits = numbers[i];
            }

        }

        return mostDigits;
    }


}
