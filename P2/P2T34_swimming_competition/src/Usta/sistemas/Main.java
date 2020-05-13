package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 12/05/2020
      Description: this software allow to simulate the data of a swimming competition where the four
                   times are stored for each competitor and also
                   determine based on all the times of the competitors who is the winner.
     */

    public static void main(String[] args) {
        f_menu();
        int total_competitors = f_user_number_of_competitors();
        double[][] matrix_competition = f_fill_matrix_competition(total_competitors);
        f_show_times(matrix_competition, total_competitors);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftSwimming competition               ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_user_number_of_competitors() {
        //Description: this method return the number of competitors the user want
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the number of competitors you want to evaluate:");
        int numb_competitors = keyboard.nextInt();

        while (numb_competitors < 0) {
            System.err.println("Error: you must input at least one competitor");

            System.out.println("Input again the number of competitors you want to evaluate:");
            numb_competitors = keyboard.nextInt();
        }
        return numb_competitors;
    }

    public static double[][] f_fill_matrix_competition(int total_competitors) {
        //Description: this method fill the matrix, and return it
        double[][] matrix_competition = new double[total_competitors][10];
        for (int i = 0; i < total_competitors; i = i + 1) { //Para recorrer las filas (competidores)
            for (int c = 0; c < 10; c = c + 1) { //Para recorrer las columnas (tiempos)
                matrix_competition[i][c] = Math.floor(Math.random() * (10 - 6) + 6); //valores randomicos entre 6.0 y 10.0
            }
        }
        return matrix_competition;
    }

    public static void f_show_times(double[][] matrix_competition, int total_competitors) {
        //Description: this method show the time of the all competitors
        System.out.println("----------time of competition-------------");
        System.out.println("Competitor |  T1  |  T2  |  T3  |  T4  |  T5  |  T6  |  T7  |  T8  |  T9  |  T10  |");
        for (int i = 0; i < total_competitors; i = i + 1) { //recorrer filas
            System.out.print("    "+(i+1));
            for (int c = 0; c < 1; c = c + 1) { // recorrer columnas
                System.out.println("      | "+matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"  | "+
                                               matrix_competition[i][c]+"   | ");
            }
        }
    }
}
