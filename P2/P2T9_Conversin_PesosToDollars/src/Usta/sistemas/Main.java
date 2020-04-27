package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 20/04/2020
	  Description: This software have functions that convert Colombian pesos into dollars and euros, Another for euros to dollars.
	 */
	Scanner keyboard = new Scanner(System.in);

	f_menu();

        System.out.println("1. if you want to convert pesos to dollars");
        System.out.println("2. if you want to convert pesos to euros");
        System.out.println("3. if you want to convert dollars to euros");
        System.out.println("Input a option:");
        int option = keyboard.nextInt();

        while (option < 1 || option >3){
            System.err.println("Error: invalid option");

            System.out.println("1. if you want to convert pesos to dollars");
            System.out.println("2. if you want to convert pesos to euros");
            System.out.println("3. if you want to convert dollars to euros");
            System.out.println("Input a option:");
            option = keyboard.nextInt();
        }

        if (option == 1){
            f_pesos_to_dollars();
        }else{
            if (option == 2){
                f_pesos_to_euros();
            }else{
                if (option == 3){
                    f_dollars_to_euros();
                }
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

    public static void f_pesos_to_dollars(){
        //Description: This method convert pesos to dollars
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the value in pesos:" );
        double pesos = keyboard.nextDouble();

        while (pesos < 1000){
            System.err.println("Error: Invalid value, the value must be higher than 1000");

            System.out.println("Input the value in pesos:" );
            pesos = keyboard.nextDouble();
        }

        double dollars = pesos * 0.00025;

        System.out.println("The conversion is: "+dollars+" dollars");
    }

    public static void f_pesos_to_euros(){
        //Description: This method convert pesos to euros
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the value in pesos:" );
        double pesos = keyboard.nextDouble();

        while (pesos < 1000){
            System.err.println("Error: Invalid value, the value must be higher than 1000");

            System.out.println("Input the value in pesos:" );
            pesos = keyboard.nextDouble();
        }

        double euro = pesos * 000023 ;

        System.out.println("The conversion is: "+euro+" euros");
    }

    public static void f_dollars_to_euros(){
        //Description: This method convert dollars to euros
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the value in dollars:" );
        double dollars = keyboard.nextDouble();

        while (dollars < 10){
            System.err.println("Error: Invalid value, the value must be higher than 10");

            System.out.println("Input the value in dollars:" );
            dollars = keyboard.nextDouble();
        }

        double euro = dollars * 0.92  ;

        System.out.println("The conversion is: "+euro+" euros");
    }
}
