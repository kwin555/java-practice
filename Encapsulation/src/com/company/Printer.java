package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean isDuplex = false;


    public Printer(int tonerLevel, boolean isDuplex) {
        if (this.tonerLevel >= 0 && this.tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPages = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if (this.tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
            this.numberOfPages += pagesToPrint;
            return pagesToPrint;
        } else {
            this.numberOfPages += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
