package com.globant.exercise3;

import com.globant.exercise3.decorators.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("  Welcome to the Amazing Hot Dogs");
        System.out.println("***************************************");
        System.out.println("Here you can custom your own hot dog");
        System.out.println();

        BasicHotDog hotDog = new BasicHotDog();

        int option = 0;
        do{
            System.out.println("Select the addition that you want to add: ");
            System.out.println("1 = Beacon, 2 = Cheese, 3 = Ketchup, 4 = Mustard, 5 = Lettuce");
            System.out.println("6 = Pepper, 7 = Pickles, 8 = Raw Onion, 0 = Finish");
            option = in.nextInt();
            switch (option){
                case 0:
                    break;
                case 1:
                    hotDog = new Beacon(hotDog);
                    break;
                case 2:
                    hotDog = new Cheese(hotDog);
                    break;
                case 3:
                    hotDog = new Ketchup(hotDog);
                    break;
                case 4:
                    hotDog = new Mustard(hotDog);
                    break;
                case 5:
                    hotDog = new Lettuce(hotDog);
                    break;
                case 6:
                    hotDog = new Pepper(hotDog);
                    break;
                case 7:
                    hotDog = new Pickle(hotDog);
                    break;
                case 8:
                    hotDog = new RawOnion(hotDog);
                    break;
                default:
                    System.out.println("I can't get it, try it again please!");
            }
        }while (option!=0);
        System.out.println();
        System.out.println("Cooking a Hot Dog with: ");
        System.out.println(hotDog.getDescription());
        System.out.println("Bon Appetite");
    }
}
