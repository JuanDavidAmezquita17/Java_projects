package Usta.sistemas;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 30/03/2020
	  Description: This software calculate the saving money in one month
	 */
        Scanner keyboard = new Scanner(System.in);
        f_menu();
        f_saved_money();
    }


	public static void f_menu(){
        System.out.println("-------------------Saving money------------------------");
        System.out.println("-This software calculate the saving money in one month-");
        System.out.println("---Remember that you will save the 15% of you salary---");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------Created by: Juan David Amezquita Nuñez----------");
        System.out.println("-------------------------------------------------------");
    }


    public static void f_saved_money() {
        Scanner keyboard = new Scanner(System.in);
        String name;
        double salary, s_money, s_money2, s_money3;

        System.out.println("Please input your name: ");
        name = keyboard.nextLine();

        System.out.println("Please give me your salary: ");
        salary = keyboard.nextDouble();

        if (salary <= 0) {
            System.err.println("Error: Your salary is lower than 0? Please check again your salary " + name);
        } else {
            s_money = salary * 0.15;
            s_money2 = s_money * 4;
            s_money3 = s_money2 * 12;

            System.out.println(name + " your saving money in the month is $" + s_money2);
            System.out.println("And if you continue like this");
            System.out.println("Your saving money in a year (12 months) will be $" + s_money3);
            System.out.println(" ");
            System.out.println("Good job " + name);
            System.out.println("And thanks for use this software");

        }
    }
}






