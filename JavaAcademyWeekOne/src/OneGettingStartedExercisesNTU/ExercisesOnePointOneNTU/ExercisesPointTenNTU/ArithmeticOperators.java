package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExercisesPointTenNTU;
/*
Combining Lines 18-31 into one single println() statement, using '+' to concatenate all the items together.
In Mathematics, we could omit the multiplication sign in an arithmetic expression, e.g., x = 5a + 4b. In programming,
you need to explicitly provide all the operators, i.e., x = 5*a + 4*b. Try printing the sum of 31 times of number1 and 17 times of number2.
 */

public class ArithmeticOperators {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;

        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;


        System.out.println("The sum, difference, product, quotient and remainder of " + number1 + " and " + number2
            + " are " + sum + ", " + difference + ", " + product + ", " + quotient + ", and " + remainder);

        ++number1;
        --number2;
        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number2);
        quotient = number1 / number2;
        System.out.println("The new quotient of " + number1 + " and " + number2
                + " is " + quotient);
        int excerciseTwo = (31 * number1) + (17 * number2);
        System.out.println("The sum of 31 times of " + number1 + " and 17 times of " + number2 + " is: " + excerciseTwo);
    }
}
