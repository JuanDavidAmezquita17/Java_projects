package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 06/05/2020
      Description: this software ask the user to enter N number of people's names and determine how
                   many names have the letter "a" and how many have the letter "e".
     */
    public static void main(String[] args) {
        f_menu();
        int total_person = f_number_people();
        String[] vector_name = f_fill_person(total_person);
        f_show_letter_a(vector_name);
        f_show_letter_e(vector_name);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftNames with vowels                  ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_number_people() {
        //Description: this method return a value of the number of people who input the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total people who you want to work:");
        int total_person = keyboard.nextInt();
        while (total_person < 0) {
            System.err.println("Error: sorry, but you must put at least 1 person");
            System.out.println("Input the total people who you want to work:");
            total_person = keyboard.nextInt();
        }
        return total_person;
    }

    public static String[] f_fill_person(int total_person) {
        //Description: this method returns a fill vector
        Scanner keyboard = new Scanner(System.in);
        String[] vector_name = new String[total_person];
        for (int i = 0; i < vector_name.length; i = i + 1) {
            System.out.println("Input the name of the person (" + (i + 1) + "):");
            vector_name[i] = keyboard.nextLine();
        }
        return vector_name;
    }

    public static void f_show_letter_a(String[] vector_name) {
        //Description: this method return the number of names with the letter a
        int total_words = 0;
        for (int i = 0; i < vector_name.length; i = i + 1) {
            if (vector_name[i].indexOf("a") > 0) {
                total_words = total_words + 1;
            }
        }
        System.out.println("The total word with the letter (a), are: "+total_words);
    }

    public static void f_show_letter_e(String[] vector_name) {
        //Description: this method return the number of names with the letter a
        int total_words = 0;
        for (int i = 0; i < vector_name.length; i = i + 1) {
            if (vector_name[i].indexOf("e") > 0) {
                total_words = total_words + 1;
            }
        }
        System.out.println("The total word with the letter (e), are: "+total_words);
    }
}
