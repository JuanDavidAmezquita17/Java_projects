package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*Author: Juan David Amezquita Nuñez
          Date: 21/04/2020
          Description: The software determinate the total saved per person in X months
          The program should calculate the value of total savings and average

         */
        f_menu();
        Scanner keyboard = new Scanner(System.in);

        int n_months = f_total_months();
        int total_saved = 0, average, money_saved;

        for (int i=1;i<=n_months;i=i+1){
            System.out.println("Input the money in the "+i+" month:");
            money_saved = keyboard.nextInt();
             while (money_saved < 0){
                 System.err.println("The value must be al least 0");

                 System.out.println("Input the money in the "+i+" month again:");
                 money_saved = keyboard.nextInt();
             }
            total_saved=total_saved + money_saved;
        }

        average = total_saved / n_months;
        System.out.println("The total saved in "+n_months+" months, is: "+total_saved);
        System.out.println("The average of your saving money is: "+average);

    }

    public static  void f_menu(){
        //Description: Menu

        System.out.println("-------------------------------------------");
        System.out.println("-    SavedMoney                           -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");
    }

    public static int f_total_months(){
        //Description: This method return the total months

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the total months: ");
        int n_months = keyboard.nextInt();

        while (n_months < 1){
            System.err.println("Error: you should put more than one month");

            System.out.println("Input the total months: ");
            n_months = keyboard.nextInt();
        }

        return n_months;

    }


}
