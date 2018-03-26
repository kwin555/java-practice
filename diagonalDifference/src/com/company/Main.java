package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] twoDArray = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        System.out.println(diagonalDifference(twoDArray,3));
    }
    public static int diagonalDifference(int [][] array, int size) {
        int sumFirstDiagonal = 0;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == j) {
                    sumFirstDiagonal += array[i][j];
                }
            }
        }
        int sumSecondDiagonal = 0;
        for(int i = array.length -1; i >= 0; i--) {
            for(int j = 0; j < array.length; j++) {
                if(i + j == size - 1) {
                    sumSecondDiagonal += array[i][j];
                }
            }
        }
        return Math.abs(sumFirstDiagonal - sumSecondDiagonal);
    }
}
