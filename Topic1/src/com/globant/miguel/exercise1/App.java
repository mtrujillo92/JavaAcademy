package com.globant.miguel.exercise1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String color;
        int battery,storage;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our music store");
        System.out.println("Please write a color: Green or Blue");
        color = in.nextLine();
        System.out.println("Please write the capacity in GB 8 or 16");
        storage = in.nextInt();
        System.out.println("Finally write the battery life in hours 5 or 8");
        battery = in.nextInt();
        MusicPlayer mp1 = MusicPlayerFactory.getMusicPlayer(color,battery,storage);
        System.out.println("Your music player is " + mp1);
    }
}
