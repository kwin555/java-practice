package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] integerArray = getIntegers(5);
        int[] sortedArray = sortInteger(integerArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int numberOfElements) {
        System.out.println("Enter " + numberOfElements +  " numbers for the array : \r");
        int[] numbers = new int[numberOfElements];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    public static int[] sortInteger (int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < sortedArray.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int [] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int tempHolder;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    tempHolder = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = tempHolder;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element Number: " + i + " Element: " + array[i]);
        }
     }
}
