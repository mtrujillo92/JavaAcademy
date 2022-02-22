package com.miguel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerEarth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        String s = scan.next();
        scan.nextLine();
        Double d = scan.nextDouble();
        // Write your code here.
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    static String solve(int N, char[] ch){
        // Write your code here
        String result ="";
        result = String.valueOf(ch);

        return result;
    }
}

