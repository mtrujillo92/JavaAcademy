package com.globant.topic2.beans;

public class ColorPrinter implements Printer {
    @Override
    public void print(String texto) {

        System.out.println("imprimiendo a color "+texto);
    }
}
