package com.globant.section3;

public class PrimitiveTypesFloat {
    public static void main(String[] args) {
        /*
            tipos primitivos enteros: float(32bits)
                                      double(64bits)
         */

        float numeroFloat = 3.4028235E38F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
    }
}
