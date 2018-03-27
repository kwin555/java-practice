package com.company;



import java.util.Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {140537896, 243908675, 670291834, 923018467, 520718469};
        Arrays.sort(array);
        minMaxSum(array);
    }
    public static void minMaxSum (int[] array) {
        long sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        long max = sum - array[0];
        long min = sum - array[array.length - 1];
        System.out.println(min + " " + max);
    }
}
