package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 24/03/2020
	  Description: This software calculate the final grade of the student
	 */

	Scanner keyboard = new Scanner (System.in);

	double grade1, grade2, grade3, grade4, final_grade;

        System.out.println("This software calculate the final of a student");
        System.out.println("The software take the first note as the 20%");
        System.out.println("The software take the second note as the 25%");
        System.out.println("The software take the third note as the 25%");
        System.out.println("The software take the fourth note as the 35%");

        System.out.println("Please, enter the first note:");
        grade1 = keyboard.nextDouble();
        System.out.println("Please, enter the second note:");
        grade2 = keyboard.nextDouble();
        System.out.println("Please enter the third note:");
        grade3 = keyboard.nextDouble();
        System.out.println("Please enter the fourth note:");
        grade4 = keyboard.nextDouble();

        // OR = || AND = &&
        if (grade1 < 0 || grade1 > 5 ||
            grade2 < 0 || grade2 > 5 ||
            grade3 < 0 || grade3 > 5 ||
            grade4 < 0 || grade4 >5) {
            System.err.println("ERROR: the notes needs to be in range of 0 to 5");
        }else {
            final_grade = (grade1 * 0.2) + (grade2 * 0.25) + (grade3 * 0.25) + (grade4 * 0.35);

            System.out.println("The final grade is: " + final_grade);
            System.out.println("Thanks for use this software, created by Juan David Amezquita Nuñez");
        }


    }
}
