package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExercisesPointTenNTU;
/*
Based on the above example, write a program called SumProduct3Numbers, which introduces one more int variable called number3,
and assign it an integer value of 77. Compute and print the sum and product of all the three numbers.
 */
public class SumProduct3Numbers {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int number3 = 77;
        int sum, product;

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        System.out.println("The sum and the product of " + number1 + " and " + number2 + " and " + number3 + " are " + sum + ", and " + product);
    }
}
