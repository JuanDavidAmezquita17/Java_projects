package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 19 March, 2020
	  Description: This software generate a bill of supermarket paradise
	 */
        Scanner keyboard = new Scanner(System.in);
        int prod_1, prod_2, prod_3, prod_4, total_bruto;
        double  total, iva;

        System.out.println("Bill software of supermarket paradise, input the fist product");


        prod_1 = keyboard.nextInt();

        System.out.println("Input the second product: ");

        prod_2 = keyboard.nextInt();

        System.out.println("Input the third product: ");

        prod_3 = keyboard.nextInt();

        System.out.println("Input the fourt product: ");

        prod_4 = keyboard.nextInt();

        total_bruto = prod_1 + prod_2 + prod_3 + prod_4;

        iva = total_bruto * 0.19;
        total = total_bruto + iva;

        System.out.println("Your bill is");
        System.out.println("Total bruto: $" + total_bruto);
        System.out.println("IVA: $" + iva);
        System.out.println("Total: $" + total);

        System.out.println("Thanks for use this software, Created by Juan David Amezquita Nuñez");



    }
}
