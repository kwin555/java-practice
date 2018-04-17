package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(solution("abc","d"));
    }
    public static boolean solution(String str, String ending)  {
        if (ending.length() > str.length()) return false;
        int counter = endingCounter(str, ending);
        System.out.println(counter);
        if(counter == ending.length()) return true;
        return false;
//        return str.endsWith(ending);
    }

    public static int endingCounter (String str, String ending) {
        int endingCounter = 0;
            for (int j = 0 ; j < ending.length(); j++) {
                if (ending.charAt(ending.length() - 1 - j) == str.charAt(str.length() - 1 - j)) {
                    endingCounter++;
                }
            }
        return endingCounter;
    }

}
