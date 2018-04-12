package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] data = new int[] {1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0};
        DataReverse(data);
    }

    public static int[] DataReverse(int[] data) {
       int[][] conversionArray = convertOneDArrayToTwoDArray(data);
        int[][]  reversedColTwoDArray = reverseOrderOfColumnsInTwoDArray(conversionArray);
        int [] flattenedArray = convertTwoDArrayToOneD(reversedColTwoDArray);
        return flattenedArray;
    }

    public static int[][] convertOneDArrayToTwoDArray(int[] oneDArray) {
        int byteSize= 8;
        int[][] conversionArray = new int[oneDArray.length / byteSize][byteSize];
        for (int i = 0; i < conversionArray.length; i++) {
            for(int j = 0; j < conversionArray[0].length; j++) {
                conversionArray[i][j] = oneDArray[(byteSize * i) + j];
            }
        }
        return conversionArray;
    }

    public static int[][] reverseOrderOfColumnsInTwoDArray (int[][] twoDArray) {
        int[] tempArray = new int[1];
        for(int i = 0; i < twoDArray.length / 2; i++) {
            tempArray = twoDArray[i];
            twoDArray[i] = twoDArray[twoDArray.length - 1 - i];
            twoDArray[twoDArray.length - 1 - i] = tempArray;
        }
        return twoDArray;
    }

    public static int[] convertTwoDArrayToOneD (int[][] twoDArray) {
        int index = 0;
        int[] data = new int[twoDArray.length * twoDArray[0].length];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++ ) {
                data[index] = twoDArray[i][j];
                index++;
            }
        }
        return data;
    }
}
