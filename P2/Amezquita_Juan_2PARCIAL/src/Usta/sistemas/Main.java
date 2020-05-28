package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 26/05/2020
      Description: this software is for the second parcial, its for a company that want to know the
                   salary of n employees
     */

    public static void main(String[] args) {
        f_menu();
        int n_employees = f_number_employees();
        int[][] matrix_salaries = new int[n_employees][12];
        f_show_statistics(f_fill_matrix(matrix_salaries));
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   smartPeople.inc SALARIES               ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_number_employees() {
        //description: this method return the number of employees
        Scanner key = new Scanner(System.in);
        System.out.println("Input the number of employees you want to calculate the salary:");
        int n_employees = key.nextInt();
        while (n_employees < 0) {
            System.err.println("Error: the number of employees must be at least 1");

            System.out.println("Input again the number of employees you want to calculate the salary:");
            n_employees = key.nextInt();
        }
        return n_employees;
    }

    public static int[][] f_fill_matrix(int[][] matrix) {
        //Description: this method returns the matrix filled
        for (int i = 0; i < matrix.length; i++) {
            for (int m = 0; m < 12; m++) {
                matrix[i][m] = (int) Math.floor((Math.random() * 4905000 - 981000 + 1) + 981000);
            }
        }
        return matrix;
    }

    public static void f_show_statistics(int[][] matrix_fill) {
        //Description: This method show the employee who have the higher salary in the year
        //             and the total salary that the company paid in the year.
        int count = 0;
        int average = 0;
        int high_salary = 0;
        int employer_winner = 0;
        for (int i = 0; i < matrix_fill.length; i++) {
            for (int m = 0; m < 12; m++) {
                count = count + matrix_fill[i][m];

                if (matrix_fill[i][m] > high_salary) {
                    high_salary = matrix_fill[i][m];

                    employer_winner = employer_winner + 1;
                }
            }
        }
        average = count / (matrix_fill.length * 12);
        int total_high_salary = high_salary * 12;
        System.out.println("The employee who have the higher salary is the employee number: " + employer_winner);
        System.out.println("With the salary of: " + total_high_salary + " in the year. ");

        System.out.println("The total paid by the company in one year was:");
        System.out.println(count);
        System.out.println("The average of the salaries per employee per month is:");
        System.out.println(average);
    }
}
