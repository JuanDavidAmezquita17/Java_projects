package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 07/05/2020
      Description: this software generates the weights (values ​​between 20 to 120 kilos) for N men, save the weights in a vector and with that
                   information determine:

                   How many are malnourished (those who weigh less than 40 kilos)

                   How many are skinny (those who weigh at least 30 or less than 70 kilos)

                   How many are fat (more than 70 kilos).
     */

    public static void main(String[] args) {
        f_menu();
        int total_people = f_user_number_of_people();
        double[] vector_weight = f_fill_vector_weight(total_people);
        f_show_malnourished(vector_weight);
        f_show_skkiny(vector_weight);
        f_show_fat(vector_weight);
        f_show_all_weights(vector_weight);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SofSkkiny and fat                      ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_user_number_of_people() {
        //Description: this method returns the number of people that the user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total people:");
        int total_people = keyboard.nextInt();
        while (total_people < 1) {
            System.err.println("Error: the value must be at least 1");
            System.out.println("Input again the total people:");
            total_people = keyboard.nextInt();
        }
        return total_people;
    }

    public static double[] f_fill_vector_weight(int total_people) {
        //Description: this method return the vector of weight
        double[] vector_weight = new double[total_people];
        for (int i = 0; i < vector_weight.length; i = i + 1) {
            vector_weight[i] = (Math.random() * (120 - 21) + 20);
        }
        return vector_weight;
    }

    public static void f_show_malnourished(double[] vector_weight) {
        //Description: this method show the total people malnourished
        int total_maln = 0;
        for (double weight : vector_weight) {
            if (weight < 40) {
                total_maln = total_maln +1;
            }
        }
        System.out.println("The total of malnourished people is: "+total_maln);
    }

    public static void f_show_skkiny(double[] vector_weight) {
        //Description: this method show the total people skkiny
        int total_skkiny= 0;
        for (double weight : vector_weight) {
            if (weight >= 40 && weight < 70) {
                total_skkiny = total_skkiny +1;
            }
        }
        System.out.println("The total of skkiny people is: "+total_skkiny);
    }

    public static void f_show_fat(double[] vector_weight) {
        //Description: this method show the total people fat
        int total_fat= 0;
        for (double weight : vector_weight) {
            if (weight >= 70) {
                total_fat = total_fat +1;
            }
        }
        System.out.println("The total of fat people is: "+total_fat);
    }

    public static void f_show_all_weights(double[] vector_weight){
        //Description: this method show the all weights
        for (int i = 0; i < vector_weight.length; i = i + 1){
            System.out.println("The weight of the person ("+(i+1)+") is: "+vector_weight[i]);
        }
    }


}
