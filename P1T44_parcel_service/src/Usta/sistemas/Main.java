package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 01/04/2020
	  Description: Determinate the cost of the parcel, and The cost for the parcel service is based on the weight of the package
and the area to which it is addressed.
	 */
        Scanner keyboard = new Scanner(System.in);

        String name;
        int p1, p2, p3, p4, p5;
        int destiny, total_bill;



        f_menu();

        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Press 1 if the shipping is to North America");
        System.out.println("Press 2 if the shipping is to Central America");
        System.out.println("Press 3 if the shipping is to South America");
        System.out.println("Press 4 if the shipping is to Europe");
        System.out.println("Press 5 if the shipping is to Asia");
        destiny = keyboard.nextInt();
        int value = f_procedure(destiny);

        System.out.println("Enter the price of the first product");
        p1 = keyboard.nextInt();
        System.out.println("Enter the price of the second product");
        p2 = keyboard.nextInt();
        System.out.println("Enter the price of the third product");
        p3 = keyboard.nextInt();
        System.out.println("Enter the price of the fourth product");
        p4 = keyboard.nextInt();
        System.out.println("Enter the price of the fifth product");
        p5 = keyboard.nextInt();

        total_bill = p1 + p2 + p3 + p4 + p5 + value;
        System.out.println(name+" the total bill, with the shipping is: "+total_bill);



    }

    public static void f_menu(){
        System.out.println("----------------------------------------");
        System.out.println("-  Shipping software                   -");
        System.out.println("-  Created by Juan David Amezquita Nuñez");
        System.out.println("----------------------------------------");
    }

    public static int f_procedure(int destiny){

        Scanner keyboard = new Scanner(System.in);
        int value = 0;

        if (destiny == 1 ) {
            value = 11;
        } else {
            if (destiny == 2){
                value = 10;
            } else {
                if ( destiny == 3 ){
                    value = 12;
                } else {
                    if ( destiny == 4 ){
                        value = 23;
                    }else {
                        if ( destiny == 5 ){
                            value = 27;
                        }
                    }
                }
            }
        }



        return value;




    }
}
