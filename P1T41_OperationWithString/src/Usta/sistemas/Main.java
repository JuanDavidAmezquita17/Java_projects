package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 26/03/2020
	  Description: This software realizes many operations with String
	 */
	Scanner keyboard = new Scanner(System.in);
	String name;
        System.out.println("-----------------------------------------------");
        System.out.println("                 StringSoft                    ");
        System.out.println("----Created by: Juan David Amezquita Nuñez-----");
        System.out.println("Input your name please: ");
        name = keyboard.nextLine();
        if (name.indexOf("gomez")!= -1){
            System.out.println("Gomez already exist!");
        } else {
            System.out.println("Gomez doesn´t exist");
        }
        System.out.println("The name in uper case is: " + name.toUpperCase());
        System.out.println(name.replace( "a", "@"));



    }
}
