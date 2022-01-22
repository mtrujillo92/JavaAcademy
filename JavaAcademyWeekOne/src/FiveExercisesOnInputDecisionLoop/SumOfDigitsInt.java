package FiveExercisesOnInputDecisionLoop;

import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args) {
        int inNumber, inDigit, sum=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();

        while ( inNumber > 0){
            inDigit = inNumber % 10;
            sum += inDigit;
            inNumber /= 10;
        }
        System.out.print("The sum is: " + sum);

    }
}
