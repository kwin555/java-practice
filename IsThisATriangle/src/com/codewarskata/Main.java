package com.codewarskata;

public class Main {

    public static void main(String[] args) {
        System.out.println(isTriangle(7,2,2));
    }
    public static boolean isTriangle(int lengthSideA, int lengthSideB, int lengthSideC){
        return (lengthSideA + lengthSideB > lengthSideC) && (lengthSideA + lengthSideC > lengthSideB) &&
                (lengthSideB + lengthSideC > lengthSideA) ? true : false;
    }

}
