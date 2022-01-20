package FiveExercisesOnInputDecisionLoop;
/*
Write a program called CircleComputation that prompts user for the radius of a circle in floating point number.
The program shall read the input as double; compute the diameter, circumference, and area of the circle in double;
and print the values rounded to 2 decimal places. Use System-provided constant Math.PI for pi.
 */

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("The area is: %.2f%n", area);
        System.out.printf("The circumference is: %.2f", circumference);
    }
}
