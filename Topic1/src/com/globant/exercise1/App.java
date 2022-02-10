package com.globant.exercise1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String choice;

        MusicPlayerBuilder builder = new MusicPlayerBuilder();
        builder.setStorage(Storage.SIXTEEN_GB);
        System.out.println(builder);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our music store");
        System.out.println("Please write a color: Green or Blue");
        choice = in.nextLine();

        if(choice.equals("Green"))
            builder.setColor(Color.GREEN);
        else if (choice.equals("Blue"))
            builder.setColor(Color.BLUE);
        else
            System.out.println("That color is not available");

        System.out.println("Please write the capacity in 8GB or 16GB");
        choice = in.nextLine();
        if(choice.equals("8GB"))
            builder.setStorage(Storage.EIGHT_GB);
        else if (choice.equals("16GB"))
            builder.setStorage(Storage.SIXTEEN_GB);
        else
            System.out.println("That capacity is not available");

        System.out.println("Finally write the battery life in hours 5 or 8");
        choice = in.nextLine();
        if(choice.equals("5"))
            builder.setBattery(Battery.FIVE_HOURS);
        else if (choice.equals("8"))
            builder.setBattery(Battery.EIGHT_HOURS);
        else
            System.out.println("That capacity is not available");

        System.out.println(builder);
    }
}
