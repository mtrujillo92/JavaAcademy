package FiveExercisesOnInputDecisionLoop;
/*
Write a program called Add2Integers that prompts user to enter two integers.
The program shall read the two integers as int; compute their sum; and print the result.
 */
import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args) {
        int number1, number2, sum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();
        in.close();
        sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }
}
