package Usta.sistemas;

import java.util.Random;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 04/05/2020
      Description: this software Saves the salaries of 5 employees using an arrangement (vector), where the salaries are a random value
                   between $ 1,000,000 and $ 2,000,000, use a function to calculate the salary and save it in the vector .
                   Then create another function to display the salary information.
     */

    public static void main(String[] args) {
        f_menu();
        int[] salary_employees = f_salaries();

        f_show_salaries(salary_employees);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Vector salary                          ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int[] f_salaries() {
        //Description: This method returns a vector with salary of 5 employees

        int[] salary = new int[5]; //This var to save the salaries of 5 employees

        for (int i = 0; i < 5; i = i + 1) {
            salary[i] = (int) Math.floor(Math.random()*(2000000 - 1000000+1)+1000000);
        }

        return salary;

    }

    public static void f_show_salaries(int[] salary) {
        //Description: This method show the salaries
        System.out.println("------The list of the salries:-------");

        for (int i = 0; i < 5; i = i + 1) {
            System.out.println("The salary of employed ("+(i+1)+") is: "+salary[i]);
        }

    }
}
