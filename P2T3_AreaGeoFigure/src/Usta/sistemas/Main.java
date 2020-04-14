package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 14/04/2020
	  Description: This software calculates the area of a circle, square or triangle.
	 */
	f_menu();

	Scanner keyboard = new Scanner(System.in);
	int option;

        System.out.println("If you want to find the area of a circle, press 1 ");
        System.out.println("If you want to find the area of a square, press 2 ");
        System.out.println("If you want to find the area of a triangle, press 3 ");
        System.out.println("Input:");
        option = keyboard.nextInt();

        if (option > 3 || option < 1){
            System.err.println("ERROR: you must select one option, 1, 2 , or 3");
        }else {
            if (option == 1){
                f_circle();
            }else {
                if (option == 2){
                    f_square();
                }else {
                    if (option == 3){
                        f_triangle();
                    }
                }
            }
        }

        System.out.println("Thanks for use this software!");

    }

    public static void f_menu(){
        System.out.println("-------------------------------------------");
        System.out.println("-    SoftAreaFigure                       -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");

    }

    public static void f_circle(){
        //Area of a circle
        Scanner keyboard = new Scanner(System.in);
        double radius, area;

        System.out.println("Please input the radius in cm: ");
        radius = keyboard.nextDouble();

        area = (radius * radius) * 3.1416;

        System.out.println("The area of this circle is: "+area);
    }

    public static void f_square(){
        //Area of a square
        Scanner keyboard = new Scanner(System.in);

        double side1, side2, area;

        System.out.println("Pleas input the first side of the square in cm: ");
        side1 = keyboard.nextDouble();

        System.out.println("Pleas input the second side of the square in cm: ");
        side2 = keyboard.nextDouble();

        area = side1 * side2;

        System.out.println("The area of the square in cm is: "+area);

    }

    public static void f_triangle(){
        //Area of a triangle
        Scanner keyboard = new Scanner(System.in);

        double base, height, area;

        System.out.println("Pleas input the base of the square in cm: ");
        base = keyboard.nextDouble();

        System.out.println("Please input the height of the square in cm: ");
        height = keyboard.nextDouble();

        area = (base * height) / 2;

        System.out.println("The area of the triangle in cm is: "+area);
    }
}
