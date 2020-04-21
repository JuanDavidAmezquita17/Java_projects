package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 21/04/2020
	  Description: This software calculates the average salary, total salary and highest salary of N employees
	 */
        Scanner keyboard = new Scanner(System.in);

	f_menu();

	int n_employees = f_n_employees();
	double total_salary = 0, average, high_salary = 0, salary_employee;

	for (int i=1;i<=n_employees;i=i+1){
	    salary_employee = f_salary(i);
	    total_salary=total_salary+salary_employee;

        if (high_salary < salary_employee){
            high_salary = salary_employee;
        }
    }
	average = total_salary / n_employees;

        System.out.println("Results:");
        System.out.println("Total salary: "+total_salary);
        System.out.println("Average: "+average);
        System.out.println("Highest salary: "+high_salary);



    }

    public static void f_menu(){
        //Description: Menu
        System.out.println("-------------------------------------------");
        System.out.println("-    Employees                            -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");
    }

    public static int f_n_employees(){
        //Description: This method return the number of employees
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the number of employees: ");
        int total_employees = keyboard.nextInt();

        while (total_employees < 1){
            System.err.println("Error: You must put at least 1 employee");

            System.out.println("Input the number of employees: ");
            total_employees = keyboard.nextInt();
        }

        return total_employees;
    }

    public static double f_salary(int i){
        //Description: This method return the salary of one employee
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the salary of the ("+i+") employee:");
        double salary = keyboard.nextDouble();

        System.out.println("How many days did this employee works:");
        double work_days = keyboard.nextInt();

        while (salary < 1 || work_days < 0 || work_days > 30){
            System.err.println("Error: the salary must be at least 1, and the work days in the range of 0 and 30");

            System.out.println("Input the salary of the ("+i+") employee:");
            salary = keyboard.nextDouble();

            System.out.println("How many days did this employee works:");
            work_days = keyboard.nextInt();
        }

        double total_salary = (salary/30) * work_days;

        return total_salary;
    }
}
