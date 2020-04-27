package Usta.sistemas;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main {
    	/*Author: Juan David Amézquita Núñez
	  Date 27/04/2020
	  Description: There is going to be a raffle for a hamburger on Olympus. A program that generates a
                   random number from 1 to 100 is required. An assistant will say a number, if it is equal
                   to the random number you are informed that you have won, otherwise change the
                   assistant with a new number until the winning number is found.
	 */

    public static void main(String[] args) {

	f_menu();

        System.out.println("Try your luck, you need to input a number between 0 to 100");
        System.out.println("You have 5 attempts");
        System.out.println("If you hit the number, you will win a hamburger!");


	int random_number = f_random_number();
	int user_number = f_user_number();
	int attemps = 5;

	while (user_number != random_number && attemps > 1){
	    attemps = attemps - 1;
        System.err.println("Sorry, but today your luck fail!");
        System.out.println("Try again, attemps ("+attemps+")");
        f_user_number();
    }

	if (attemps > 1){
        System.out.println("¡Congratulations!");
        System.out.println("Today is your lucky day, you have earned a hamburger!");
    }else{
        System.out.println("Sorry, but you lost, the number was "+random_number);
    }

    }
    public static void f_menu(){
        //Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Lucky Number                           ║");
        System.out.println("║   Versión 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_random_number(){
        //Description: This method make a random number, and return this number.
        //This method generate 2 hints to the user to find the random number.

        int number = (int) Math.floor(Math.random() * 100 + 1);

        if (number < 50){
            System.out.println("Hint 1: the number is minor than 50");
        }else {
            System.out.println("Hint 1: the number is greater than 50");
        }

        if (number % 2 == 0){
            System.out.println("Hint 2: the number is pair");
        }else {
            System.out.println("Hint 2: the number is odd");
        }

        return number;

    }

    public static int f_user_number(){
        //Description: This method ask for a number to the user, and return the number.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input a number, ¡Try your luck!:");
        int user_numb = keyboard.nextInt();

        while (user_numb < 0 || user_numb > 100){
            System.err.println("Error: the number must be in the range of 0 and 100");
        }

        return user_numb;
    }
}
