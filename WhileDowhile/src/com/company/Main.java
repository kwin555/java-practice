package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count!= 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        count = 1;
        do {
            System.out.println("Count value was "+ count);
            count++;
        }while(count != 6);
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        while (number <= finishNumber) {
            number++;
            if(!isEven(number)) {
                continue;
            }
            System.out.println("Even Number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.printf("Even numbers found: " + evenCount);
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
