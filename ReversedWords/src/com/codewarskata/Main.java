package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(reverseWords("I like eating"));
    }
    public static String reverseWords(String string){
        String[] arrayOfWords = string.split(" ");
        for (int i = 0; i < arrayOfWords.length / 2; i++) {
            String temp = arrayOfWords[i];
            arrayOfWords[i] = arrayOfWords[arrayOfWords.length - 1 - i];
            arrayOfWords[arrayOfWords.length - 1 - i] = temp;
        }
        String reversedString = "";
        for (int i = 0; i < arrayOfWords.length; i++) {
            reversedString += arrayOfWords[i] + " ";
        }
        return reversedString.substring(0,reversedString.length() - 1);
    }
}
