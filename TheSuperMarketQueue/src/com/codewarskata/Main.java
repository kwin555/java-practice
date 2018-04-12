package com.codewarskata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] queueTime = new int[] { 1,2 ,3 ,4, 5};
        System.out.println(solveSuperMarketQueue(queueTime,2));
    }
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] registers = new int[n];
        for(int i : customers) {
            registers[smallestIndex(registers)] += i;
        }
        return registers[biggestIndex(registers)];
    }

    public static int smallestIndex(int[] arr) {
        int smallestIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[smallestIndex] > arr[i])
                smallestIndex = i;
        }
        return smallestIndex;
    }

    public static int biggestIndex(int[] arr) {
        int biggestIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[biggestIndex] < arr[i])
                biggestIndex = i;
        }
        return biggestIndex;
    }
}
