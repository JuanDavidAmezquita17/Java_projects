package Usta.sistemas;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 01/06/2020
      Description: this software create a document txt who have Name:Biography:E-mail;Phone:
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
	f_menu();
        System.out.println("Input your name:");
        String name = keyboard.nextLine();
        System.out.println("Input the biography:");
        String bio = keyboard.nextLine();
        System.out.println("Input the e-mail:");
        String email = keyboard.nextLine();
        System.out.println("Input your number phone:");
        String phone = keyboard.nextLine();
        boolean if_save = f_save_data(name, bio, email, phone);
        if (if_save == true){
            System.out.println("Your information was saved in " +
                    "C:\\Users\\ASUS\\Documents\\Textos de prueba para java\\User_data.txt");
        }else {
            System.out.println("Sorry, your information was not saved");
        }
    }
    public static void f_menu() {
        //Description: menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   SoftFile data user                     ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static boolean f_save_data(String name, String bio, String email, String phone){
        //Description: this method save the information of a file
        boolean if_save = true;
        try{
            PrintWriter MyFile = new PrintWriter(
                    "C:\\Users\\ASUS\\Documents\\Textos de prueba para java\\User_data.txt",
                    "UTF-8");
            MyFile.println("Name: "+name);
            MyFile.println("Bio: "+bio);
            MyFile.println("E-mail: "+email);
            MyFile.println("Phone: "+phone);
            MyFile.close();
        } catch (Exception e) {
            System.err.println("Error: the program failed, please contact en engineer with the error code:");
            e.printStackTrace();
            if_save = false;
        }
        return if_save;
    }
}
