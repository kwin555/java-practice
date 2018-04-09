package com.codewarskata;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long number = 135440716410000L;
        System.out.println(findNb(number));
    }
    public static long findNb(long totalVolume) {
        // your code
        if ((long) 1 * 1 * 1 == totalVolume) {
            return 1;
        } else {
            long cubeLength = 2;
            long volumeOfLayers = 1;
            while (volumeOfLayers < totalVolume) {
                volumeOfLayers += (cubeLength * cubeLength * cubeLength);
                if (volumeOfLayers == totalVolume) {
                    return cubeLength;
                } else {
                    cubeLength += 1;
                }
            }
        }
        return -1;
    }
}
