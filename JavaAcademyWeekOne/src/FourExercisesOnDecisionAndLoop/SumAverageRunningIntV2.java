package FourExercisesOnDecisionAndLoop;

public class SumAverageRunningIntV2 {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int count=0;
        final int LOWERBOUND = 111;
        final int UPPERBOUND = 8899;

        for(int number = LOWERBOUND; number <= UPPERBOUND; number++){
            sum += number;
            count++;
        }
        average = (double) sum / (double) count;

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is: " + sum +"\nThe average is: " + average);
    }
}
