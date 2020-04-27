package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 14/04/2020
	  Description: This software asks for two numbers and says if one is a multiple of the other.
	 */
	f_menu();
	f_InputNumbers();

    }
    public static void f_menu(){
        System.out.println("-------------------------------------------");
        System.out.println("-    MultiplyFinder                       -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");

    }

    public static boolean f_compare(int n1, int n2){

        boolean multiplo=false;
        if (n1%n2==0){
            multiplo = true;
        }
        return multiplo;
    }

    public static void f_InputNumbers(){
        //input numbers

        Scanner keyboard = new Scanner(System.in);

        int n1, n2;

        System.out.println("This software asks for two numbers and says if one is a multiple of the other.");
        System.out.println("Input the first integer number: ");
        n1 = keyboard.nextInt();

        System.out.println("Input teh second integer number:");
        n2 = keyboard.nextInt();

        boolean rpta = f_compare(n1, n2);

        if (rpta=true){
            System.out.println(n1+" its multiple of "+n2);
        }else{
            System.out.println(n1+" its not multiple of "+n2);
        }


    }
}
