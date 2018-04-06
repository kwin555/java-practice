package com.codewarskata;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int countPassengers(ArrayList<int[]> stops) {
        int passengers = 0;
        for (int i = 0; i < stops.size(); i++) {
            passengers += stops.get(i)[0];
            passengers -= stops.get(i)[1];
        }
        return passengers;
    }
}
