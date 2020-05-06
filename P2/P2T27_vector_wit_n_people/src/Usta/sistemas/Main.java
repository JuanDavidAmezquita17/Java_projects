package Usta.sistemas;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 05/05/2020
      Description: This software generates the age randomly for N people and save them in a vector,
     */

    public static void main(String[] args) {
        f_menu();
        int n_people = f_n_people();
        int[] age_people = f_age_people(n_people);
        f_show_age(age_people);
        f_show_age_60(age_people);
        f_average(age_people, n_people);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftVector with people                 ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_n_people() {
        //Description: this method return a number that the user input for the number of people he want
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of the people: ");
        int n_people = keyboard.nextInt();
        while (n_people < 0) {
            System.err.println("Error: you must put at least 1 person");
            System.out.println("Input again the number of the people: ");
            n_people = keyboard.nextInt();
        }
        return n_people;
    }

    public static int[] f_age_people(int n_people) {
        //Description: this method return a vector with the age of n people
        int[] age_people = new int[n_people];
        for (int i = 0; i < n_people; i = i + 1) {
            age_people[i] = (int) Math.floor((Math.random() * 80) + 1);
        }
        return age_people;
    }

    public static void f_show_age(int[] age_people) {
        //Description: This method show how many have over 18 years old, and under 18 years old
        int n_people = age_people.length;
        int total_over_18 = 0, total_under_18 = 0;
        for (int i = 0; i < n_people; i = i + 1) {
            System.out.println(age_people[i]);
            if (age_people[i] < 18) {
                total_under_18 = total_under_18 + 1;
            } else {
                total_over_18 = total_over_18 + 1;
            }
        }
        System.out.println("The total of people under 18 years old are: " + total_under_18);
        System.out.println("The total of people over 18 years old are: " + total_over_18);
    }

    public static void f_show_age_60(int[] age_people) {
        //Description: This method show how many have over 60 years old
        int n_people = age_people.length;
        int total_over_60 = 0;
        for (int i = 0; i < n_people; i = i + 1) {
            if (age_people[i] > 60) {
                total_over_60 = total_over_60 + 1;
            }
        }
        System.out.println("The total of people over 18 years old are: " + total_over_60);
    }

    public static void f_average(int[] age_people, int n_people) {
        //Description: this method show the average of the ages
        int sum_age = 0;
        for (int i = 0; i < age_people.length; i = i + 1){
            sum_age = sum_age + age_people[i];
        }
        double average = sum_age / n_people;

        System.out.println("The average is: "+average);
    }


}
