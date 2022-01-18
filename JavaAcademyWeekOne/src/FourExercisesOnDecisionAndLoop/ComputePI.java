package FourExercisesOnDecisionAndLoop;

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1_000_000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2){
            if(denominator % 4 == 1)
                sum += 1 / (double)denominator;
            else if (denominator % 4 == 3)
                sum -= 1 / (double)denominator;
            else
                System.out.println("Impossible!!!");
        }
        System.out.println("The sum is: " + (4 * sum));
    }
}
