package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 18/04/2020
	  Description: This software convert the first letter of a word entered as a parameter. Create another to capitalize the entire word.
	               Create another method to remove all vowels and replace it with @.

	 */
        f_menu();
        int option = f_option();

        if (option == 1) {
            f_first_option();
        } else {
            if (option == 2) {
                f_second_option();
            }else{
                if (option == 3){
                    f_third_option();
                }
            }
        }
        
    }

    public static void f_menu() {
        System.out.println("-------------------------------------------");
        System.out.println("-    CapWordSoft                          -");
        System.out.println("-    Version 1.0                          -");
        System.out.println("-    Created By: Juan David Amezquita     -");
        System.out.println("-------------------------------------------");

    }

    public static int f_option() {
        //Options of the software
        Scanner keyboard = new Scanner(System.in);
        int option;

        System.out.println("1. if you want the first letter of a word entered as a parameter.");
        System.out.println("2. if you want to capitalize the entire word.");
        System.out.println("3. if you want to remove all vowels and replace it with @.");
        System.out.println("Input a option:");
        option = keyboard.nextInt();

        while (option < 1 || option > 3) {
            System.err.println("This option does not exist!");

            System.out.println("1. if you want the first letter of a word entered as a parameter.");
            System.out.println("2. if you want to capitalize the entire word.");
            System.out.println("3. if you want to remove all vowels and replace it with @.");
            System.out.println("Input a option:");
            option = keyboard.nextInt();

        }

        return option;

    }

    public static void f_first_option() {
        //This method return the first letter of a word
        Scanner keyboard = new Scanner(System.in);
        String word;

        System.out.println("Input the word:");
        word = keyboard.nextLine();

        while (word.length() < 5) {
            System.err.println("This word must have minimum 5 letters.");

            System.out.println("Input the word:");
            word = keyboard.nextLine();

        }

        char [] letters=word.toCharArray();

        System.out.println("The first letter is: "+letters[0]);


    }

    public static void f_second_option(){
        //This method capitalize all the word
        Scanner keyboard = new Scanner(System.in);
        String word;

        System.out.println("Input the word:");
        word = keyboard.nextLine();

        while (word.length() < 5) {
            System.err.println("This word must have minimum 5 letters.");

            System.out.println("Input the word:");
            word = keyboard.nextLine();

        }

        System.out.println("The uppercase is: "+word.toUpperCase());

    }

    public static void f_third_option(){
        //This method remove all vowels and replace it with @.
        Scanner keyboard = new Scanner(System.in);
        String word;

        System.out.println("Input the word:");
        word = keyboard.nextLine();

        while (word.length() < 5) {
            System.err.println("This word must have minimum 5 letters.");

            System.out.println("Input the word:");
            word = keyboard.nextLine();

        }
        String word2 = word.toLowerCase();
        System.out.println("The word is: "+word2.replace("a", "@").replace("e","@").replace("i","@").replace("o","@").replace("u","@"));

    }


}
