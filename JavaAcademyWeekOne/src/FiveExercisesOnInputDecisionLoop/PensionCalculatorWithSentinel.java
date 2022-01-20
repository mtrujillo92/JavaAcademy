package FiveExercisesOnInputDecisionLoop;

import java.util.Scanner;

/*
Based on the previous PensionContributionCalculator, write a program called
PensionContributionCalculatorWithSentinel which shall repeat the calculations until
user enter -1 for the salary.
 */
public class PensionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        int salary, age, contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = in.nextInt();


        while (salary != SENTINEL) {
            System.out.print("Enter the age: ");
            age = in.nextInt();
            contributableSalary = (salary >= SALARY_CEILING) ? SALARY_CEILING : salary;
            if (age <= 55){
                employeeContribution = (double) contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = (double)contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
            } else if (age <= 60){
                employeeContribution = (double)contributableSalary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = (double)contributableSalary * EMPLOYER_RATE_55_TO_60;
            } else if (age <= 65){
                employeeContribution = (double)contributableSalary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = (double)contributableSalary * EMPLOYER_RATE_60_TO_65;
            } else{
                employeeContribution = (double)contributableSalary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = (double)contributableSalary * EMPLOYER_RATE_65_ABOVE;
            }
            totalContribution = employeeContribution + employerContribution;
            System.out.printf("The employee's contribution is: $%.2f%n",employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n",employerContribution);
            System.out.printf("The total contribution is: $%.2f%n",totalContribution);
            System.out.print("Enter the monthly salary (or -1 to end): $");
            salary = in.nextInt();
        }
        System.out.println("bye!");

    }
}
