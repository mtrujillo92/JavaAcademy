package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExcercisesPointElevenNTU;
/*
Modify the above program (called RunningNumberProduct) to compute the product of all the numbers from 1 to 10.
(Hint: Use a variable called product instead of sum and initialize product to 1. Modify the sum = sum + number statement to do multiplication
on variable product. Ans: 3628800)
 */
public class RunningNumberProduct {
    public static void main(String[] args) {
            final int LOWERBOUND = 1;
            final int UPPERBOUND = 10;
            int product = 1;
            int number = LOWERBOUND;
            while (number <= UPPERBOUND){
                product = product * number;
                number++;
            }
            System.out.println("The product of all numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);

    }
}
