package FiveExercisesOnInputDecisionLoop;
/*
Write a program called Swap2Integers that prompts user for two integers.
The program shall read the inputs as int, save in two variables called
number1 and number2; swap the contents of the two variables; and print the results
 */

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1, number2, temp;
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After the swap, first integer is: " + number1 + ", second integer is: " + number2);


    }
}
