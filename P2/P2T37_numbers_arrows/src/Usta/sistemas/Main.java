package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 19/05/2020
      Description: this software create a matrix with the culumns and arrows the user want
     */
    public static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        f_menu();
        int rows = f_number_user_lines();
        int columns = f_number_user_columns();
        int[][] matrix_numbers = new int[rows][columns];
        matrix_numbers = f_fill_matrix(matrix_numbers, rows, columns);

        System.out.println("Input the number of the row you want to search(0 to exit):");
        int number_row = key.nextInt();
        int summatory = 0;
        double average = 0;
        while (number_row > 0 && number_row < rows){
            for (int c = 0; c < matrix_numbers[0].length; c = c + 1){
                System.out.print(matrix_numbers[number_row][c]+" | ");
                summatory = summatory + matrix_numbers[number_row][c];
            }
            System.out.println(" ");
            average = summatory / matrix_numbers[0].length;
            System.out.println("The summatory of the ("+number_row+") row is: "+summatory);
            System.out.println("The average of the ("+number_row+") row is: "+average);
            System.out.println("Input other number for the row you want to search(0 to exit):");
            number_row = key.nextInt();
        }
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftNumber arrows                      ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int f_number_user_lines() {
        //Description: this method return the number of lines the user want
        System.out.println("Input the number of lines you want:");
        int number_lines = key.nextInt();
        while (number_lines < 0) {
            System.err.println("Error: you must put at least one line");

            System.out.println("Input again the number of lines you want:");
            number_lines = key.nextInt();
        }
        return number_lines;
    }

    public static int f_number_user_columns() {
        //Description: this method return the number of columns the user want
        System.out.println("Input the number of columns you want:");
        int number_columns = key.nextInt();
        while (number_columns < 0) {
            System.err.println("Error: you must put at least one line");

            System.out.println("Input again the number of columns you want:");
            number_columns = key.nextInt();
        }
        return number_columns;
    }

    public static int[][] f_fill_matrix(int[][] matrix_numbers, int rows, int columns) {
        //Description: this method fill the matrix
        for (int i = 0; i < rows; i = i + 1) {
            for (int c = 0; c < columns; c = c + 1){
                matrix_numbers[i][c] = (int) Math.floor(Math.random()*1000 + 1);
            }
        }
        return matrix_numbers;
    }
}
