package com.codewarskata;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public  int min(int[] list) {
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }
        return min;
    }

    public int max(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }
}
