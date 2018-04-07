package com.codewarskata;



import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = new int[]{121, 144, -19, 161, 19, 144, 19, -11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        boolean result = comp(a,b);
        System.out.println(result);
    }
    public static boolean comp(int[] a, int[] b) {
        if (( a == null) || (b == null)) {
            return false;
        }
        int[] aa = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            aa[i] = a[i] * a[i];
        }
        Arrays.sort(aa);
        Arrays.sort(b);
        return (Arrays.equals(aa,b));
    }
}
