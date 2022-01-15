package FourExercisesOnDecisionAndLoop;
/*
Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100.
Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily.
 Also compute and display the average.
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        double average;

        // For-loop
        /*
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++){
            sum += number;
        }
         */
        // While-do loop
        /*
        int number = LOWERBOUND;
        while(number <= UPPERBOUND){
            sum += number;
            number++;
        }
         */
        // Do-while loop
        int number = LOWERBOUND;
        do{
            sum += number;
            number++;
        }while (number <= UPPERBOUND);

        average = (double)sum / (double)UPPERBOUND;
        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum +"\nThe average is: " + average);



    }
}
