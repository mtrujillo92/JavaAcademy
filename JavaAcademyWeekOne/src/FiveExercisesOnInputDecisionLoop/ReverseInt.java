package FiveExercisesOnInputDecisionLoop;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber, inDigit;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        inNumber = in.nextInt();
        System.out.print("The reverse is: ");
        while ( inNumber > 0){
            inDigit = inNumber % 10;
            System.out.print(inDigit);
            inNumber /= 10;
        }

    }
}
