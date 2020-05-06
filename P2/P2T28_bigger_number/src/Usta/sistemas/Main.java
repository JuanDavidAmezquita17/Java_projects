package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 05/05/2020
      Description: this software calculate what number is the bigger or the minor
     */

    public static void main(String[] args) {
        f_menu();
        int user_number = f_user_number();
        int[] vector_numbers = f_fill_vector_numbers(user_number);

        f_show_bigger_number(vector_numbers);
        f_show_minor_number(vector_numbers);

    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftVector Bigger Number               ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_user_number() {
        //Description: this method returns the number of the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total number:");
        int user_number = keyboard.nextInt();

        while (user_number < 2) {
            System.err.println("Error: you must input at least 2 numbers");

            System.out.println("Input again the total number:");
            user_number = keyboard.nextInt();
        }
        return user_number;
    }

    public static int[] f_fill_vector_numbers(int user_number) {
        //Description: this method return the vectors
        Scanner keyboard = new Scanner(System.in);

        int[] vector = new int[user_number];
        for (int i = 0; i < vector.length; i = i + 1) {
            System.out.println("Input the number (" + (i + 1) + "): ");
            vector[i] = keyboard.nextInt();
        }
        return vector;
    }

    public static void f_show_bigger_number(int[] vector_numbers) {
        //Description:
        int bigger_number = 0;
        for (int i = 0; i < vector_numbers.length; i = i + 1) {
            if (i == 0) {
                bigger_number = vector_numbers[i];
            } else {
                if (bigger_number < vector_numbers[i]) {
                    bigger_number = vector_numbers[i];
                }
            }
            System.out.println("The vector (" + i +"): "+vector_numbers[i]);
        }
        System.out.println("The minor number is: " + bigger_number);
    }

    public static void f_show_minor_number(int[] vector_numbers) {
        //Description:
        int minor_number = 0;
        for (int i = 0; i < vector_numbers.length; i = i + 1) {
            if (i == 0) {
                minor_number = vector_numbers[i];
            } else {
                if (minor_number < vector_numbers[i]) {
                    minor_number = vector_numbers[i];
                }
            }
            System.out.println("The vector (" + i +")");
        }
        System.out.println("The minor number is: " + minor_number);
    }
}
