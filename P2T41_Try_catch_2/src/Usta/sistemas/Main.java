package Usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bFunciona = false;
        do{
            try{
                Scanner key = new Scanner(System.in);
                System.out.println("Input a number: ");
                int f_people = key.nextInt();
                bFunciona = true;

            } catch (Exception e) {
                System.err.println("Error: this software only allow numbers: "+e.toString());
                bFunciona = false;
            }
        }while (bFunciona == false);
    }
}
