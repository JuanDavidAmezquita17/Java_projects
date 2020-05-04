package Usta.sistemas;

import java.util.Random;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 04/05/2020
      Description:A company has two shifts (morning and afternoon) in which 16 employees work (4 in the morning and 4 in the
                  afternoon) to create a program in JAVA that allows storing the salaries of the employees grouped by shift.
     */

    public static void main(String[] args) {
        f_menu();

        int[] turn_morning = f_salaries_turn();
        int[] turn_afternoon = f_salaries_turn();
        int total_salary_morning = f_show_morning(turn_morning);
        int total_salary_afternoon = f_show_afternoon(turn_afternoon);
        System.out.println("The total salary (morning + afternoon) = "+(total_salary_afternoon+total_salary_morning));

    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Vector turns                           ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int[] f_salaries_turn() {
        //Description: This method returns the salary of 8 employees
        int[] salary = new int[8];

        for (int i = 0; i < 8; i = i + 1) {
            salary[i] = (int) Math.floor(Math.random() * (2000000 - 980000) + 980000);
        }

        return salary;
    }

    public static int f_show_morning(int[] turn_morning){
        //Description: This method show the salaries of the employees in the morning
        System.out.println("-------The salaries of the employees in the morning are:--------");

        int total_salary = 0;

        for (int i = 0; i < 8; i = i + 1){
            total_salary = total_salary + turn_morning[i];
            System.out.println("The salary of the employed ("+(i+1)+")= "+ turn_morning[i]);

        }
        System.out.println("The total salary is +: "+total_salary);

        return total_salary;

    }

    public static int f_show_afternoon(int[] turn_afternoon){
        //Description: This method show the salaries of the employees in the afternoon
        System.out.println("-------The salaries of the employees in the afternoon are:--------");

        int total_salary = 0;

        for (int i = 0; i < 8; i = i + 1){
            total_salary = total_salary + turn_afternoon[i];
            System.out.println("The salary of the employed ("+(i+1)+")= "+ turn_afternoon[i]);

        }
        System.out.println("The total salary is +: "+total_salary);

        return total_salary;

    }
}
