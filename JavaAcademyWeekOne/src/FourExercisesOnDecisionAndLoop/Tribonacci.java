package FourExercisesOnDecisionAndLoop;

public class Tribonacci {
    public static void main(String[] args) {
        final int N_MAX = 20;
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int fnMinus3 = 2;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + N_MAX + " Tribonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");

        while (n <= N_MAX){
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " ");
            n++;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
            sum += fn;
        }
        average = (double) sum / (double) N_MAX;
        System.out.print("\nThe average is " + average);
    }
}
