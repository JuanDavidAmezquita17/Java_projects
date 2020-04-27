package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 20/04/2020
	  Description: This software calculates the average height of a group of N children and generated the average.
	 */
        f_menu();

        int total_children = f_total_children();
        double summatory = 0, average;

        for (int i = 1; i <= total_children; i = i + 1) {
            summatory = summatory + f_height_child(i);
        }

        average = summatory / total_children;
        System.out.println("The average is: " + average + " m");


    }

    public static void f_menu() {
        System.out.println("-------------------------------------------");
        System.out.println("-    AverageSoft                          -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");

    }

    public static int f_total_children() {
        //Description: This method return the number of children

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the total children to calculate the height: ");
        int children = keyboard.nextInt();

        while (children < 2) {
            System.err.println("Error: You must input minimum 2 children");

            System.out.println("Input again the total children to calculate the height: ");
            children = keyboard.nextInt();
        }

        return children;
    }

    public static double f_height_child(int i) {
        //Description: This method return the height of a child
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the height (mts) of the child: ");
        double height = keyboard.nextDouble();

        while (height < 0.2 || height > 2) {//20 cm o 2 m
            System.err.println("Error: you must enter a value in the range of 20 cm and 2m");

            System.out.println("Input again the height (mts) of the child: ");
            height = keyboard.nextDouble();
        }

        return height;
    }

}
