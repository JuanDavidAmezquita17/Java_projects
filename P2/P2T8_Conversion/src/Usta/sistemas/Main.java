package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 20/04/2020
	  Description: This software converts kilometers into miles and yards y upside down.
	 */
	Scanner keyboard = new Scanner(System.in);

	f_menu();

        System.out.println("1. if you want to convert kilometers into miles");
        System.out.println("2. if you want to convert miles into kilometers");
        System.out.println("Input a option:");
        int option = keyboard.nextInt();

        while (option < 1 || option > 2){
            System.err.println("Error: invalid option");

            System.out.println("1. if you want to convert kilometers into miles");
            System.out.println("2. if you want to convert miles into kilometers");
            System.out.println("Input a option:");
            option = keyboard.nextInt();
        }

        if (option == 1){
            f_kilometers_to_miles();
        }else{
            if (option == 2){
                f_miles_to_kilometers();
            }
        }





    }

    public static void f_menu(){
        //Description: Menu
        System.out.println("-------------------------------------------");
        System.out.println("-    Conversion                           -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");

    }

    public static void f_kilometers_to_miles(){
        //Description: This method convert kilometers into miles
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the value in km: ");
        double km = keyboard.nextDouble();

        while (km < 1){
            System.err.println("Error: invalid value");

            System.out.println("Input the value in km: ");
            km = keyboard.nextDouble();
        }

        double miles = km * 0.621371;

        System.out.println("The conversion is: "+ miles+ " miles");


    }

    public static void f_miles_to_kilometers(){
        //Description: This method convert miles into kilometers
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the value in miles: ");
        double miles = keyboard.nextDouble();

        while (miles < 1){
            System.err.println("Error: invalid value");

            System.out.println("Input the value in miles: ");
            miles = keyboard.nextDouble();
        }

        double km = miles * 1.60934;

        System.out.println("The conversion is: "+ km+ " km");

    }


}
