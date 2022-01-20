package FiveExercisesOnInputDecisionLoop;
/*
Both the employer and the employee are mandated to contribute a certain percentage of the employee's salary
towards the employee's pension fund. The rate is tabulated as follows:

Employee's Age	    Employee Rate (%)	Employer Rate (%)
55 and below	    20	                17
above 55 to 60	    13	                13
above 60 to 65	    7.5	                9
above 65	        5	                7.5
However, the contribution is subjected to a salary ceiling of $6,000. In other words, if an employee earns $6，800,
only $6，000 attracts employee's and employer's contributions, the remaining $800 does not.

Write a program called PensionContributionCalculator that reads the monthly salary and age (in int) of an employee.
Your program shall calculate the employee's, employer's and total contributions (in double); and print the results
rounded to 2 decimal places.
 */
import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
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
        System.out.print("Enter the monthly salary: $");
        salary = in.nextInt();
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
    }
}
