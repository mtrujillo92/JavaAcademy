package com.globant.section4;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double alto, ancho, area, perimetro;
        Scanner in = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        alto = Double.parseDouble(in.nextLine());
        System.out.println("Proporciona el ancho:");
        ancho = Double.parseDouble(in.nextLine());
        area= alto * ancho;
        perimetro = (alto + ancho) * 2;
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
    }
}
