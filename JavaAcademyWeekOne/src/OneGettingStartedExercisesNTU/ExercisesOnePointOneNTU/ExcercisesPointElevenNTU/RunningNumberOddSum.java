package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExcercisesPointElevenNTU;
/*
Modify the above program (called RunningNumberOddSum) to sum all the odd numbers between 1 to 1000.
(Hint: Change the post-processing statement to "number = number + 2". Ans: 250000)
 */

public class RunningNumberOddSum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            sum = sum + number;
            number = number + 2;
        }
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }
}
