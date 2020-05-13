package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 13/05/2020
      Description: this software rate the food of the college
     */

    public static void main(String[] args) {
        f_menu();
        int user_number = f_number_of_students();
        int[][] matrix_rating = f_fill_matrix_rating(user_number);
        f_show_rating(matrix_rating,user_number);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftRating Food                        ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_number_of_students() {
        //Description: this method return the number of students that the user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number of students to rate the restaurant:");
        int user_number = keyboard.nextInt();
        while (user_number < 1 || user_number > 9) {
            System.err.println("Error: sorry but the software need at least 1 student, and the maximum of students is 10.");
            System.out.println("Input again the number of students to rate the restaurant:");
            user_number = keyboard.nextInt();
        }
        return user_number;
    }

    public static int[][] f_fill_matrix_rating(int user_number) {
        //Description: this method fill the matrix, and return it
        int[][] matrix_rating = new int[user_number][20];
        for (int i = 0; i < user_number; i = i + 1) { //Para recorrer las filas (competidores)
            for (int c = 0; c < 20; c = c + 1) { //Para recorrer las columnas (tiempos)
                matrix_rating[i][c] = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1); //valores randomicos entre 1.0 y 10.0
            }
        }
        return matrix_rating;
    }

    public static void f_show_rating(int[][] matrix_rating, int user_number) {
        //Description: this method show the rating of the all students
        System.out.println("----------Rating table-------------");
        System.out.println("Competitor |  D1  |  D2  |  D3  |  D4  |  D5  |  D6  |  D7  |  D8  |  D9  |  D10  " +
                "|  D11  |  D12  |  D13  |  D14  |  D15  |  D16  |  D17  |  D18  |  D19  |  D20  |");
        for (int i = 0; i < user_number; i = i + 1) { //recorrer filas
            System.out.print("    "+(i+1));
            for (int c = 0; c < 1; c = c + 1) { // recorrer columnas
                System.out.println("      |  "+matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"   |  "+
                        matrix_rating[i][c]+"    |   "+
                        matrix_rating[i][c]+"   |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  "+
                                matrix_rating[i][c]+"    |  ");
            }
        }
        System.out.println("bad (<= 3)");
        System.out.println("Regular (between 4 and 6)");
        System.out.println("Excellent (> = 7)");
    }
}
