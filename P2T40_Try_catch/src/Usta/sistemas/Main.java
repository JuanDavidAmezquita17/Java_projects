package Usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner key = new Scanner(System.in);
            System.out.println("Input a number: ");
            int numb1 = key.nextInt();
            System.out.println("Input a other number: ");
            int numb2 = key.nextInt();

            int numb3 = numb1 + numb2;
            System.out.println("The sum of the first number and the number 2 is. " + numb3);
        } catch (Exception e) {
            System.err.println("Error: you must input only numbers. "+e.toString());
        }
    }
}
