package com.globant.topic2.beans;

public class BlackWhitePrinter implements Printer {
    @Override
    public void print(String document) {

        System.out.println("Printing in Black and White this document:  " + document);
    }
}
