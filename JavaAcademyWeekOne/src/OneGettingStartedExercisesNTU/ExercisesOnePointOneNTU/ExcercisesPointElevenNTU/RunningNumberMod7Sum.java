package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExcercisesPointElevenNTU;
/*
Modify the above program (called RunningNumberMod7Sum) to sum all the numbers between 1 to 1000 that are divisible by 7.
(Hint: Modify the initialization statement to begin from 7 and post-processing statement to increment by 7. Ans: 71071)
 */
public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 1000;
        int sum = 0;
        int number = LOWERBOUND + 6;
        while (number <= UPPERBOUND){
            sum = sum + number;
            number = number + 7;
        }
        System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " numbers divisible by 7 is " + sum);
    }
}
