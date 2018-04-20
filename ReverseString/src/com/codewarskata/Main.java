package com.codewarskata;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("yolo"));
    }
    public static String reverse(String str)
    {
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
