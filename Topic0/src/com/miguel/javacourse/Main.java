package com.miguel.javacourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Memory.MemoryOverflowException {
        Memory memoryTest = new Memory();
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Welcome to memory test
                To create a new system process write cs
                To create a new application process write ca
                To delete a process in memory write d + process ID e.g d3
                Write "exit" to close the program""");
        do {
            System.out.print("Write your command: ");
            input = in.nextLine();
            if (input.equals("cs"))
                memoryTest.systemProcessCreator();
            else if (input.equals("ca"))
                memoryTest.applicationProcessCreator();
            else if (input.contains("d"))
                memoryTest.processDelete(input);
            else
                System.out.println("Unkown command try again");
        }while (!input.equals("exit"));

    }
}
