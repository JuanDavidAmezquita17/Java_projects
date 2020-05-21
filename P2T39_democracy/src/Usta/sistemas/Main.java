package Usta.sistemas;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 21/05/2020
      Description: this software simulate a democracy voting for the Boyacá governorate
     */

    public static void main(String[] args) {
        f_menu();
        int[][] matrix_votes = new int[123][8];
        f_show_winner(f_fill_matrix(matrix_votes));
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftVotes for Boyaca governorate       ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int[][] f_fill_matrix(int[][] matrix_votes) {
        //Description: This method fill the matrix

        for (int i = 0; i < matrix_votes.length; i++) {
            matrix_votes[i][0] = (int) Math.floor((Math.random() * 1000) + 1);
            matrix_votes[i][1] = (int) Math.floor((Math.random() * 1000) + 1);
            matrix_votes[i][2] = (int) Math.floor((Math.random() * 1000) + 1);
            matrix_votes[i][3] = (int) Math.floor((Math.random() * 1000) + 1);
            matrix_votes[i][4] = (int) Math.floor((Math.random() * 1000) + 1);
            matrix_votes[i][5] = (int) Math.floor((Math.random() * 1000) + 1);
            matrix_votes[i][6] = (int) Math.floor((Math.random() * 1000) + 1);
            matrix_votes[i][7] = (int) Math.floor((Math.random() * 1000) + 1);
        }
        return matrix_votes;
    }

    public static void f_show_winner(int[][] matrix_votes) {
        //Description: this method show the results of the votation
        int winner = 0, numb_candidate = 0, winner2 = 0, numb_candidate2 = 0;
        int total_votes1 = 0, total_votes2 = 0, total_votes3 = 0, total_votes4 = 0, total_votes5 = 0;
        int total_votes6 = 0, total_votes7 = 0, total_votes8 = 0;
        for (int i = 0; i < matrix_votes.length; i++) {
            total_votes1 = total_votes1 + matrix_votes[i][0];
            total_votes2 = total_votes2 + matrix_votes[i][1];
            total_votes3 = total_votes3 + matrix_votes[i][2];
            total_votes4 = total_votes4 + matrix_votes[i][3];
            total_votes5 = total_votes5 + matrix_votes[i][4];
            total_votes6 = total_votes6 + matrix_votes[i][5];
            total_votes7 = total_votes7 + matrix_votes[i][6];
            total_votes8 = total_votes8 + matrix_votes[i][7];
        }
        if (winner == 0){
            winner = total_votes1;
            numb_candidate = 1;
        }if (winner < total_votes2){
            winner = total_votes2;
            numb_candidate = 2;
        }if (winner < total_votes3){
            winner = total_votes3;
            numb_candidate = 3;
        }if (winner < total_votes4){
            winner = total_votes4;
            numb_candidate = 4;
        }if (winner < total_votes5){
            winner = total_votes5;
            numb_candidate = 5;
        }if (winner < total_votes6){
            winner = total_votes6;
            numb_candidate = 6;
        }if (winner < total_votes7){
            winner = total_votes7;
            numb_candidate = 7;
        }if (winner < total_votes8){
            winner = total_votes8;
            numb_candidate = 8;
        }

        if (winner != winner2){
            if (winner2 < total_votes1 && total_votes1 != winner){
                winner2 = total_votes1;
                numb_candidate2 = 1;
            }if (winner2 < total_votes2 && total_votes2 != winner){
                winner2 = total_votes2;
                numb_candidate2 = 2;
            }if (winner2 < total_votes3 && total_votes3 != winner){
                winner2 = total_votes3;
                numb_candidate2 = 3;
            }if (winner2 < total_votes4 && total_votes4 != winner){
                winner2 = total_votes4;
                numb_candidate2 = 4;
            }if (winner2 < total_votes5 && total_votes5 != winner){
                winner2 = total_votes5;
                numb_candidate2 = 5;
            }if (winner2 < total_votes6 && total_votes6 != winner){
                winner2 = total_votes6;
                numb_candidate2 = 6;
            }if (winner2 < total_votes7 && total_votes7 != winner){
                winner2 = total_votes7;
                numb_candidate2 = 7;
            }if (winner2 < total_votes8 && total_votes8 != winner) {
                winner2 = total_votes8;
                numb_candidate2 = 8;
            }
        }
        System.out.println("The total votes for the first candidate are: "+total_votes1);
        System.out.println("The total votes for the second candidate are: "+total_votes2);
        System.out.println("The total votes for the third candidate are: "+total_votes3);
        System.out.println("The total votes for the fourth candidate are: "+total_votes4);
        System.out.println("The total votes for the fifth candidate are: "+total_votes5);
        System.out.println("The total votes for the sixth candidate are: "+total_votes6);
        System.out.println("The total votes for the seventh candidate are: "+total_votes7);
        System.out.println("The total votes for the eighth candidate are: "+total_votes8);
        System.out.println(" ");
        System.out.println("The winner is the candidate number: "+numb_candidate);
        System.out.println("With: "+winner+" votes");
            System.out.println(" ");
            System.out.println("The second place is the candidate number: "+numb_candidate2);
            System.out.println("With: "+winner2+" votes");
    }
}
