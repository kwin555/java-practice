package com.codewarskata;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(whatTimeIsIt(36));
    }

    public static String whatTimeIsIt(final double angle) {
        DecimalFormat df = new DecimalFormat("00");
        double time = angle / 30;
        int hours = (int) time;
        int minutes = (int) (time * 60) % 60;
        if(hours == 0){hours = 12;}
        return String.valueOf(df.format(hours))+":"+String.valueOf(df.format(minutes));
    }

}
