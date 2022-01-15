package FourExercisesOnDecisionAndLoop;

public class Product1ToN {
    public static void main(String[] args) {
        long product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 13;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++){
            product *= number;
        }
        System.out.println(product);
    }
}
