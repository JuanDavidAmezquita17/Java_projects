package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amézquita Núñez
      Date: 28/04/2020
      Description: This software Ask for 10 numbers. Show the mean of positive numbers,
                   the mean of negative numbers and the number of zeros.
     */


    public static void main(String[] args) {

        f_menu();

    }

    public static void f_menu() {
        //Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Operation with numbers                 ║");
        System.out.println("║   Versión 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static void f_operation_numbers() {
        //Description: This function ask for 10 numbers
        int sum_positives = 0, sum_negatives = 0, sum_zero = 0, number;
        int total_positives = 0, total_negatives = 0;
        double average_pos, average_neg;

        for (int i = 1; i <= 10; i = i + 1) {
            number = f_user_number(i);

            if (number < 0) {
                sum_negatives = sum_negatives - number;
                total_negatives = total_negatives + 1;
            } else {
                if (number > 0) {
                    sum_positives = sum_positives + number;
                    total_positives = total_positives + 1;
                } else {
                    sum_zero = sum_zero + 1;
                }
            }

        }

        if (total_positives > 0) {
            average_pos = sum_positives / total_positives;
        }
        if (total_negatives > 0) {
            average_neg = sum_negatives / total_negatives;
        }

        System.out.println("The average of the positive numbers: "+average_pos);
        System.out.println("The average of the negative numbers: "+average_neg);


    }

    public static int f_user_number(int i) {
        //Description: This function return a number for the user
        Scanner keyboard = new Scanner(System.in);

        System.out.println("input the number (" + i + "):");
        int user_number = keyboard.nextInt();

        return user_number;
    }
}
