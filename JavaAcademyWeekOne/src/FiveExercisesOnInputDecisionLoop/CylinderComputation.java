package FiveExercisesOnInputDecisionLoop;
/*
    Write a program called CylinderComputation that prompts user for the base radius and height of a cylinder in floating point number.
    The program shall read the inputs as double; compute the base area, surface area, and volume of the cylinder; and print the values
    rounded to 2 decimal places.
 */
import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height, baseArea, surfaceArea, volume;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        System.out.print("Enter the height: ");
        height = in.nextDouble();
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius * height + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("The surface area is: %.2f%n", surfaceArea);
        System.out.printf("The volume is: %.2f%n", volume);

    }
}
