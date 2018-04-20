package com.codewarskata;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static int[] minMax(int[] array) {
        Arrays.sort(array);
        int[] minMaxArray = {array[0], array[array.length -1]};
        return minMaxArray;
    }
}

