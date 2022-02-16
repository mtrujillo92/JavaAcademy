package com.globant.miguel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class EvaluatingEPowX {
    public static void main(String[] args) {
        int numberOfTest;
        double value;
        Scanner in = new Scanner(System.in);
        System.out.print("Write how many test cases: ");
        numberOfTest = in.nextInt();
        List <Double> values = new ArrayList<>(numberOfTest);
        for (int i = 1; i <= numberOfTest; i++) {
            System.out.print("Write the " + i + " test case value: ");
            value = in.nextDouble();
            values.add(value);
        }
        System.out.println("The results are: ");
        values.forEach(x -> formatNumber.accept(seriesExpansion.apply(x)));

    }
    static Consumer <Double> formatNumber = number -> {
        System.out.printf("%.4f%n",number);
    };

    public static Function<Integer, Integer> factorialFunction = number -> {
        int factorial = 1;
        while (number!=0){
            factorial = factorial*number;
            number--;
        }
        return factorial;
    };

    static Function<Double,Double> seriesExpansion = number -> {
        double result = 1;
        for (int i = 1; i < 10; i++) {
            result = result + ((Math.pow(number, i)) / (double) factorialFunction.apply(i));
        }
        return result;
    };
}
