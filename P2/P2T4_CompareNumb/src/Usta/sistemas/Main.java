package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 14/04/2020
	  Description: This software asks for two numbers and says if they are the same or not.
	 */
	f_menu();

	boolean rpta = f_compare();

	if (rpta == true){
        System.out.println("-----------------------------------");
        System.out.println("- The two numbers are the same    -");
        System.out.println("-----------------------------------");
    }else {
        System.out.println("-----------------------------------");
        System.out.println("- The two numbers aren't the same -");
        System.out.println("-----------------------------------");
    }

    }

    public static void f_menu(){
        System.out.println("-------------------------------------------");
        System.out.println("-    SoftCompNumb                       -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");

    }

    public static boolean f_compare(){
        Scanner keyboard = new Scanner(System.in);
        int n1, n2;
        boolean rpta;

        System.out.println("This software asks for two integer numbers and says if they are the same or not.");
        System.out.println("Input the fist number: ");
        n1 = keyboard.nextInt();

        System.out.println("Input the second number: ");
        n2 = keyboard.nextInt();

        if (n1 == n2){
            rpta = true;
        }else {
            rpta = false;
        }

        return rpta;
    }
}
