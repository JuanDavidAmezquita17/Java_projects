package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 30/03/2020
	  Description: In this software the user needs to enter the complete name, and some letters change, a=@, e=3, i=1, o=0.
	 */
	Scanner keyboard = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   StringSoft USTA 2020                   ║");
        System.out.println("║   Versión 1.0                            ║");
        System.out.println("║   Creado por: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");

        String name;

        System.out.println("Please enter your name:");
        name = keyboard.nextLine();

        if (name.length()<6){
            System.err.println("ERROR: the name is very short, you must enter the full name (name and surname).");
         if (name.length()>20)
            System.err.println("ERROR: The name is too long, you only have to enter your full name (name and surname).");
        }  else {
            System.out.println(name.replace("a","@").replace("e","3").replace("i","1").replace("o","0")
            .replace("A","@").replace("E","3").replace("I","1").replace("O", "0"));
        }

        System.out.println("");
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Thanks for use this software!          ║");
        System.out.println("╚══════════════════════════════════════════╝");




    }
}
