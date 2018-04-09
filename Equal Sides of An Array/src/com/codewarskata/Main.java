package com.codewarskata;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] test = new int[] {1, 2, 3, 4, 3, 2, 1};
        int sums = findEvenIndex(test);
        System.out.println(sums);
    }
    public static int findEvenIndex(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i-1];
            sumRight -= arr[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}
