package com.codewarskata;

public class Main {

    public static void main(String[] args) {
        System.out.println(persistence(999));
    }
    public static int persistence(long n) {
        int count = 1;
        if(n<9){
            return 0;
        }
        while(needsMorePersistence(n)>9){
            n = needsMorePersistence(n);
            count++;
        }
        return count;
    }

    public static long needsMorePersistence(long n){
        String p = Long.toString(n);
        long value=1;
        for (int i = 0; i < p.length(); i++) {
            value = value * Long.parseLong(p.substring(i, i+1));
        }
        return value;
    }

}
