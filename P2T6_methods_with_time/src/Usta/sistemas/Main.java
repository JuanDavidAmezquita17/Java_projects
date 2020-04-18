package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date 15/04/2020
	  Description: This software calculates the number of seconds in a given time in hours, minutes and seconds.
	               and he number of hours, minutes and seconds of a given time in seconds.
	 */
	f_menu();
	int option = f_option();

	if (option == 1){
	    f_convert_hours_to_seconds();
    }else {
	    if (option == 2){
	        f_convert_minutes_to_seconds();
        }else {
	        if (option == 3){
	            f_convert_seconds_to_hours_and_minutes();
            }
        }
    }

    }
    public static void f_menu(){
        //Menu
        System.out.println("-------------------------------------------");
        System.out.println("-    MethodsWithTime                      -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");

        System.out.println("1. if you want to convert hours to seconds");
        System.out.println("2. if you want to convert minutes to seconds");
        System.out.println("3. if you want to convert minutes to hours");
    }

    public static int f_option(){
        //Procedure with while
        Scanner keyboard = new Scanner(System.in);
        int option;

        System.out.println("Choose a option: ");
        option = keyboard.nextInt();

        while (option > 3 || option < 1){
            System.err.println("Err: you must choose one option");
            System.out.println("Choose a option");
            option = keyboard.nextInt();
        }
        return option;


    }

    public static void f_convert_hours_to_seconds(){
        // This procedure convert hours to seconds
        Scanner keyboard = new Scanner(System.in);
        int hours, seconds;

        System.out.println("Input the hours: ");
        hours = keyboard.nextInt();

        seconds = hours * 3600;

        System.out.println(hours+" in seconds are: "+seconds+" seconds");

    }

    public static void f_convert_minutes_to_seconds(){
        //This procedure convert minutes to seconds
        Scanner keyboard = new Scanner(System.in);
        int minutes, seconds;

        System.out.println("Input the minutes: ");
        minutes = keyboard.nextInt();

        seconds = minutes * 60;

        System.out.println(minutes+" are: "+seconds+" seconds");
    }

    public static void f_convert_seconds_to_hours_and_minutes(){
        //This procedure convert second to hours and minutes
        Scanner keyboard = new Scanner(System.in);
        int seconds, hours, minutes, residuo;

        System.out.println("Input the seconds: ");
        seconds = keyboard.nextInt();

        if (seconds < 3600){
            hours = 0;
            minutes = seconds/60;

            System.out.println("The time is: "+minutes+" minutes");
        } else {
            hours = seconds/3600;
            residuo = seconds % 3600;
            minutes = residuo/60;

            System.out.println("The time is: "+hours+" hrs, and "+minutes+" minutes");
        }


    }



}
