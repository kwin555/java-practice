package com.codewarskata;

public class Main {

    public static void main(String[] args) {
        int[] nums= new int[] {17, 17, 2, 17, 17, 17};
        System.out.println(stray(nums));
    }
    static int stray(int[] numbers) {
        int strayNumber = numbers[0];
        if (strayNumber != numbers[1]) return strayNumber;
        for (int number : numbers) {
            if(number != numbers[0]) {
                return number;
            }
        }
        return -1;
    }
}
