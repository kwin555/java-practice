package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(expandedForm(70304));
    }
    public static String expandedForm(int num)
    {
        String numString = convertIntToString(num);
        char[] charArray = stringToCharArray(numString);
        int [] asciiValueArray = charArrayToAsciiValueArray(charArray);
        int[] digitsArray = asciiValueArrayIntoDigitsArray(asciiValueArray);
        digitsArray = reverseIntArray(digitsArray);
        int [] properTensPlaceArray = addTensPlaceToDgitsArray(digitsArray);
        String result = convertTensPlaceToOutput(properTensPlaceArray);
        return result;
    }

    public static String convertIntToString (int num) {
        return String.valueOf(num);
    }

    public static char[] stringToCharArray(String string) {
        return string.toCharArray();
    }

    public static int[] charArrayToAsciiValueArray(char[] charArray) {
        int [] asciiValueArray = new int[charArray.length];
        for(int i = 0; i < asciiValueArray.length; i++) {
            asciiValueArray[i] = (int) charArray[i];
        }
        return asciiValueArray;
    }

    public static int[] asciiValueArrayIntoDigitsArray (int[] asciiValueArray) {
        for (int i = 0; i < asciiValueArray.length; i++) {
            asciiValueArray[i] -= 48;
        }
        return asciiValueArray;
    }

    public static int[] reverseIntArray(int[] intArray) {
        int temp;
        int sizeOfArray = intArray.length;
        for(int i = 0; i < sizeOfArray / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[sizeOfArray -1 - i];
            intArray[sizeOfArray - i - 1] = temp;
        }
        return intArray;
    }

    public static int[] addTensPlaceToDgitsArray (int[] digitsArray) {
        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] *= (int) Math.pow(10, i);
        }
        return digitsArray;
    }

    public static String convertTensPlaceToOutput (int[] tensPlaceArray) {
        String result = tensPlaceArray[tensPlaceArray.length - 1] + "";
        for(int i = tensPlaceArray.length - 2; i >= 0; i--) {
            if(tensPlaceArray[i] != 0) {
                result +=  " " + "+" + " " + tensPlaceArray[i];
            }
        }
        return result;
    }

}
