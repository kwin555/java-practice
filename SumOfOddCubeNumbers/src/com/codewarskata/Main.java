package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int cubeOdd(int[] array) {
        int[] arrayEvensReplacedWithZeros = replaceEvensWithZeross(array);
        int[] cubedElementsArray = cubeElementsWithinArray(arrayEvensReplacedWithZeros);
        int sum = sumOfArrayElements(cubedElementsArray);
        return sum;
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int[] replaceEvensWithZeross (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                array[i] = 0;
            }
        }
        return array;
    }
    public static int[] cubeElementsWithinArray (int[] array){
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i],3);
        }
        return array;
    }
    public static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
