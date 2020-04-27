package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 22/04/2020
	  Description: A housewife needs to make the market of the month and only has $ 500,000 pesos.
	 */
	f_menu();

	Scanner keyboard = new Scanner(System.in);
	int summatory = 0, cost_product = 0, total_product = 0;

	while (summatory<=500000){

	    total_product=total_product+1;
        System.out.println("Input the value of the product ("+total_product+") product");
        cost_product = keyboard.nextInt();

        summatory = summatory + cost_product;
        System.out.println("The total of your purchase now is: "+summatory);

    }
	summatory = summatory - cost_product;
	total_product = total_product - 1;
        System.out.println("The total bill of you purchase is: "+summatory);
        System.out.println("Total of products: "+total_product);
    }

    public static void f_menu(){
        //Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Market                                 ║");
        System.out.println("║   Versión 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }


}
