package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExcercisesPointElevenNTU;
/*
Modify the above program (called RunningNumberSquareSum) to find the sum of the square of all the numbers
from 1 to 100, i.e. 1*1 + 2*2 + 3*3 +... (Hint: Modify the sum = sum + number statement. Ans: 338350)
 */

public class RunningNumberSquareSum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        int product = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            product = number * number;
            sum = sum + product;
            number++;
        }
        System.out.println("The sum of the square of all the number from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
}
