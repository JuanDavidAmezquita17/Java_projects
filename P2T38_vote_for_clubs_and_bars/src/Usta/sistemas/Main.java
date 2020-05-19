package Usta.sistemas;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 19/05/2020
      Description: this software with a matrix create the votes for open the clubs and the bars
     */

    public static void main(String[] args) {
        f_menu();
        int[][] matrix_votes = new int[123][2];
        int[][] matrix_fill_votes = f_fill_matrix(matrix_votes);
        f_show_winner(matrix_fill_votes);
    }

    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftVotes for clubs and bars           ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static int[][] f_fill_matrix(int[][] matrix_votes) {
        //Description: this method fill the matrix
        for (int i = 0; i < matrix_votes.length; i = i + 1) {
            matrix_votes[i][0] = (int) Math.floor((Math.random() * 5000) + 1); //Vote for no
            matrix_votes[i][2] = (int) Math.floor((Math.random() * 5000) + 1); //Votes for yes
        }
        return matrix_votes;
    }

    public static void f_show_winner(int[][] matrix_votes){
        //Description: this method show the winner
        int total_yes = 0, total_not = 0;
        for (int i = 0; i < matrix_votes.length; i = i + 1){
            total_not = total_not + matrix_votes[i][0];
            total_yes = total_yes + matrix_votes[i][0];
        }
        if (total_not == total_yes){
            System.out.println("There is a tie");
        }else if (total_not > total_yes){
            System.out.println("Total vote yes vote: "+total_yes);
            System.out.println("Total votes not vote: "+total_not);
            System.out.println("NOT votes wins");
        }else{
            System.out.println("Total vote yes vote: "+total_yes);
            System.out.println("Total votes not vote: "+total_not);
            System.out.println("YES votes wins");
        }
    }
}
