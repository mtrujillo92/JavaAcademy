package com.globant.section4;

import java.util.Scanner;

public class MajorNumber {
    public static void main(String[] args) {
        int numero1, numero2, mayor;
        Scanner in = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        numero1 = Integer.parseInt(in.nextLine());
        System.out.println("Proporciona el numero2:");
        numero2 = Integer.parseInt(in.nextLine());
        mayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es:\n" + mayor);
    }
}
