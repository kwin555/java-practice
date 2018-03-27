package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        staircase(4);
    }
    public static void staircase (int levels) {
        String hash = "#";
        for(int i = 1; i <= levels; i++) {
            System.out.printf("%" + (levels + 1) + "s",hash + "\n");
            hash = "#" + hash;
        }
    }
}
