package com.globant.section2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String author;
        String book;
        Scanner in = new Scanner(System.in);
        System.out.print("Write the book name: ");
        book = in.nextLine();
        System.out.print("Write the book's author name: ");
        author = in.nextLine();
        System.out.println(book + " was written by " + author);
    }
}
