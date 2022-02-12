package com.globant.topic2.beans;

public class BlackWhitePrinter implements Printer {
    @Override
    public void print(String texto) {

        System.out.println("imprimiendo a blanco y negro " + texto);
    }
}
