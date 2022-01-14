package com.miguel;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double principal =0;
        float rate = 0;
        int time = 0;

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextDouble();
            if (principal>= 1_000 && principal <=1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        while (true) {
            System.out.print("Annual interest rate: ");
            rate = scanner.nextFloat();
            if (rate>=1 && rate<=30) {
                rate = (rate / PERCENT) / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while (true) {
            System.out.print("Time in years: ");
            time = scanner.nextInt();
            if (time>=1 && time <=30){
                time = time * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage = principal * (( rate * ( Math.pow(1 + rate , time )))/(Math.pow( 1 + rate, time)-1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);

/*
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number%5==0 && number%3==0)
            System.out.println("FizzBuzz");
        else if (number%5==0)
            System.out.println("Fizz");
        else if (number%3==0)
            System.out.println("Buzz");
        else
            System.out.println(number);
        String input="";
        while (true){
            System.out.print("Input");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        String[] fruits ={"Apple", "Mango", "Orange"};
        for(int i = 0; i<fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);

 */
    }
}
