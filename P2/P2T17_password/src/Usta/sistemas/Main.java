package Usta.sistemas;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 22/04/2020
	  Description: This software ask for a password (3 attempts maximum) or until the password is 352, 259 or 569.

	 */
	f_menu();

	f_main_procedure();

    }

    public static void f_menu(){
        //Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Password                               ║");
        System.out.println("║   Versión 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static void f_main_procedure (){
        //Description: This method is the main procedure of the software
        Scanner keyboard = new Scanner(System.in);
        int conter = 0;

        System.out.println("Input the password: ");
        int password = keyboard.nextInt();

        if (password == 352 || password == 259 || password == 569){
            f_aceptado();
        }else {
            while (conter < 2){
                conter = conter +1;

                if (password == 352 || password == 259 || password == 569) {
                    f_aceptado();
                }else{
                    if (password != 352 || password != 259 || password != 569){
                        System.err.println("Error: invalid password");
                        System.err.println("You have only 3 Attempts.");
                        System.err.println("Your account will be locket at the third incorrect Attempt.");
                        System.err.println("try ("+conter+")");


                        System.out.println("Input the password again: ");
                        password = keyboard.nextInt();
                    }
                }

            }

        }

    }

    public static void f_aceptado(){
        System.out.println("You are in.");
    }

}
