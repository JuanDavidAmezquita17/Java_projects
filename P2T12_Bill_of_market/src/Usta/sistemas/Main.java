package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 21/04/2020
	  Description: This software calculates gross value and total value = gross value + VAT (19%) for N products
	 */
	f_menu();
	Scanner keyboard = new Scanner(System.in);

	int n_products = f_n_products();
	double total_bill = 0;

	for (int i=1;i<=n_products;i=i+1){
	    total_bill = total_bill + f_value_prodct(i);
    }

        System.out.println("The total bill for this purchase is: "+total_bill);

    }

    public static void f_menu(){
        //Description:  Menu

        System.out.println("-------------------------------------------");
        System.out.println("-    BillofMarket                         -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");
    }

    public static int f_n_products(){
        //Description: This method return the number of products
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the number of product:");
        int total_products = keyboard.nextInt();

        while (total_products < 1){
            System.err.println("Error: you must input at least 1 product");

            System.out.println("Input the number of product:");
            total_products = keyboard.nextInt();
        }
        return total_products;
    }

    public static double f_value_prodct(int i){
        //Description: This method return the total value of the product
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the value of the ("+i+") product:");
        double value_prodcut = keyboard.nextDouble();

        while (value_prodcut < 1){
            System.err.println("Error: the value must be at least 1");

            System.out.println("Input the value of the ("+i+") product again:");
            value_prodcut = keyboard.nextDouble();
        }

        if (value_prodcut > 1000) {

            double iva = value_prodcut * 0.19;
            value_prodcut = value_prodcut + iva;
        }

        return value_prodcut;
    }
}
