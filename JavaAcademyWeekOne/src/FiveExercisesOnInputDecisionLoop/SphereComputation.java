package FiveExercisesOnInputDecisionLoop;
/*
Write a program called SphereComputation that prompts user for the radius of a sphere in floating point number.
The program shall read the input as double; compute the volume and surface area of the sphere in double;
and print the values rounded to 2 decimal places.
 */

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius, volume, surfaceArea;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        surfaceArea = 4.0 * Math.PI * radius * radius;
        volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;

        System.out.printf("volume is: %.2f%n", volume);
        System.out.printf("The surface area is: %.2f%n", surfaceArea);
    }
}
