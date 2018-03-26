package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array = {-4, 3, -9, 0, 4, 1};
        plusMinus(array);
    }
    public static void plusMinus(int[] array) {
        double postiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                postiveCount++;
            } else if (array[i] == 0) {
                zeroCount++;
            } else {
                negativeCount++;
            }
        }
        double totalNumber = array.length;
        System.out.println(postiveCount / totalNumber);
        System.out.println(negativeCount / totalNumber);
        System.out.println(zeroCount/ totalNumber);
    }
}
