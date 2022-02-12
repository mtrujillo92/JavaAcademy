package com.globant.topic2.beans;

public class ColorPrinter implements Printer {
    @Override
    public void print(String document) {

        System.out.println("Printing full color this document: " + document);
        }
}
