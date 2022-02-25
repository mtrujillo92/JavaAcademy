package com.globant.section3;

import java.util.Scanner;

public class BookStoreActivity {
    public static void main(String[] args) {
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        Scanner in = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        nombre = in.nextLine();
        System.out.println("Proporciona el id:");
        id = Integer.parseInt(in.nextLine());
        System.out.println("proporciona el precio:");
        precio = Double.parseDouble(in.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        envioGratuito = Boolean.parseBoolean(in.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
