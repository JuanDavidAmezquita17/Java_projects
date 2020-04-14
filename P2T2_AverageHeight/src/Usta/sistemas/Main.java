package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 13/04/2020
	  Description: This software find the average of height
	 */
	f_menu();

	double summatory = f_sum_height();
        System.out.println("The summatory is: "+summatory);

        f_average(summatory);

        System.out.println("Thanks for use this software");
    }

    public static void f_menu(){
        //Description: Menu
        System.out.println("-------------------------------------");
        System.out.println("- AverageHeight                     -");
        System.out.println("- Created by: Juan David Amezquita  -");
        System.out.println("-------------------------------------");


    }

    public static double f_sum_height(){
        //Description: this method calculate the summatory of 5 children
        Scanner keyboard = new Scanner(System.in);

        double summatory, h1, h2, h3, h4, h5;

        System.out.println("Please enter the first height in m");
        h1 = keyboard.nextDouble();

        System.out.println("Please enter the second height in m");
        h2 = keyboard.nextDouble();

        System.out.println("Please enter the third height in m");
        h3 = keyboard.nextDouble();

        System.out.println("Please enter the fourth height in m");
        h4 = keyboard.nextDouble();

        System.out.println("Please enter the fifth height in m");
        h5 = keyboard.nextDouble();


        summatory = h1 + h2 + h3 + h4 + h5;

        return summatory;

    }

    public static void f_average(double summatory){
        //Description: this method find the average

        double average;

        average = summatory/5;

        System.out.println("The average in m is: "+average);
    }

}
