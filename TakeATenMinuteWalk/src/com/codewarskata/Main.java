package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int counter = 0;
        int northSouthPos = 0;
        int westEastPos = 0;
        for (int i = 0; i < walk.length; i++ ) {
            counter++;
            if(walk[i] == 'n') {
                northSouthPos += 1;
            } else if (walk[i] == 's') {
                northSouthPos -= 1;
            } else if (walk[i] == 'e') {
                westEastPos += 1;
            } else if (walk[i] == 'w') {
                westEastPos -= 1;
            }
        }

        if (counter == 10 && northSouthPos == 0 && westEastPos == 0) return true;
        return false;
    }
}
