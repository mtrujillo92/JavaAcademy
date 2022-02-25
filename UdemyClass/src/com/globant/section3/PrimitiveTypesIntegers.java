package com.globant.section3;

public class PrimitiveTypesIntegers {
    public static void main(String[] args) {
        /*
            tipos primitivos enteros: byte(8bits)   -128 to 127
                                      short(16bits) -32768 to 32767
                                      int(32bits)   -2^31 to 2^31-1
                                      long(64bits)  -2^63 to 2^63-1
         */
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
    }
}
