package com.globant.section3;

import java.util.Scanner;

public class ConvertionPrimitiveDataTypes {
    public static void main(String[] args) {
        //convertir un tipo String a un tipo int
        String edadTexto = "20";
        int edad = Integer.parseInt(edadTexto);
        System.out.println("edad = " + (edad + 1));

        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        var in = new Scanner(System.in);
        System.out.print("Write your age: ");
        edad = Integer.parseInt( in.nextLine() );
        System.out.println("edad = " + edad);

        //convertir entero u otro valor a String
        edadTexto = String.valueOf(edad);

        var caracter = "Hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        
    }
}
