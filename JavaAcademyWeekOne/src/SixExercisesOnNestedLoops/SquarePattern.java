package SixExercisesOnNestedLoops;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();

        System.out.println("For loop: ");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                System.out.print("# ");
            System.out.println();
        }
        int row = 1;
        int col = 1;
        System.out.println("While do loops:");
        while(row <= size){
            while (col <= size){
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
            col = 1;
        }

    }
}
