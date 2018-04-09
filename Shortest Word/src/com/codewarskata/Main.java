package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String example = "bitcoin take over the world maybe who knows perhaps";
        findShort(example);
    }
    public static int findShort(String sentence) {
        String[] words = sentence.split(" ");
        String shortestWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }
        return shortestWord.length();
    }
}
