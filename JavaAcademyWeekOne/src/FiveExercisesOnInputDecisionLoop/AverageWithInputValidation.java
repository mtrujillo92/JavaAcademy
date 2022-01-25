package FiveExercisesOnInputDecisionLoop;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;
        Scanner in = new Scanner(System.in);
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; studentNo++) {
            System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
            numberIn = in.nextInt();
            isValid=false;
            do {

                if (numberIn >= 0 && numberIn <= 100)
                    isValid = true;
                else {
                    System.out.println("Invalid input, try again...");
                    System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                    numberIn = in.nextInt();
                }
            } while (!isValid);
            sum += numberIn;
        }
        average = (double) sum / (double) NUM_STUDENTS;
        System.out.printf("The average is: %.2f",average);
    }
}
