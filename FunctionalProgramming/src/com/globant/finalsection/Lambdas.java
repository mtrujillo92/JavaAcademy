package com.globant.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            if (name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        String upperCasedName = upperCaseName.apply("Alex", 21);
        System.out.println(upperCasedName);
    }
}
