package com.codewarskata;


public class Main {

    public static void main(String[] args) {
        String dna = "GTAT";
        System.out.println(makeComplement(dna));
    }
    public static String makeComplement(String dna) {
        String[] dnaArrayList = dna.split("",dna.length());
        for (int i = 0; i < dnaArrayList.length; i++) {
            if(dnaArrayList[i].equals("A")) {
                dnaArrayList[i] = "T";
            } else if (dnaArrayList[i].equals("T")) {
                dnaArrayList[i] = "A";
            } else if (dnaArrayList[i].equals("G")) {
                dnaArrayList[i] = "C";
            } else if (dnaArrayList[i].equals("C")) {
                dnaArrayList[i] = "G";
            }
        }
        String complementStrand = "";
        for (int i = 0; i < dnaArrayList.length; i++) {
            complementStrand += dnaArrayList[i];
        }
        return complementStrand;
    }
}
