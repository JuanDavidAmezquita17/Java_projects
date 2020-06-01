package Usta.sistemas;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 01/06/2020
      Description: this software show the information of a file.
     */

    public static void main(String[] args) {
	try{
        Scanner Myfile = new Scanner(new File("C:\\Users\\ASUS\\Documents\\Textos de prueba para java\\Prueba_2.txt"));
        while (Myfile.hasNextLine()){
            System.out.println(Myfile.nextLine());
        }

    } catch (Exception e) {
        System.err.println("Error: the software failed, please contact the engineer and show the error:");
        e.printStackTrace();
    }
    }
}
