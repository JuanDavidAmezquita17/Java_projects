package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
	  Date: 25/03/2020
	  Description: Preparcial, this software is a doctor that determine if you have covid-19
	 */
	Scanner keyboard = new Scanner(System.in);
        int cough, body_pain, t_breathing, fever, age;

        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("--This software is a doctor that determinate if you have coronavirus (COVID-19), and can help you if you have--");
        System.out.println("-------------------------Please answer the following questions-------------------------------------------------");
        System.out.println("-------------------------If the answer is yes, press 1---------------------------------------------------------");
        System.out.println("-------------------------If the answer is not, press 0---------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("-------------------------Created by: Juan David Amezquita Nuñez------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        System.out.println("Do you have a dry cough?");
        cough = keyboard.nextInt();

        if (cough>1 || cough<0){
            System.out.println("ERROR, your answer only can be 1 or 0");
        }

        System.out.println("Do you have body pain?");
        body_pain = keyboard.nextInt();

        if (body_pain>1 || body_pain<0) {
            System.out.println("ERROR, your answer only can be 1 or 0");
        }

        System.out.println("Do you have trouble breathing?");
        t_breathing = keyboard.nextInt();

        if (t_breathing>1 || t_breathing<0){
            System.out.println("ERROR, your answer only can be 1 or 0");
        }

        System.out.println("Please input the grades of your fever in °C: ");
        fever = keyboard.nextInt();

        if (fever>42 || fever<20){
            System.out.println("ERROR: your fever is not in the range of the temperature of a human.");
        }

        System.out.println("Please input your age: ");
        age = keyboard.nextInt();

        if (age>100 || age<0){
            System.out.println("ERROR: your age can be only in the range of 0-100");
        }

        if (cough==1 && body_pain==1 && t_breathing==1 && fever>=38){
            System.out.println("--You have symptoms of coronavirus (COVID-19), please call the special numbers of your country and make the tests.--");
        }  if (age>60){
            System.out.println("You are at a vulnerable age, and you have symptoms to coronavirus (COVID-19), please contact your health insurer");
        } else {
            System.out.println("Stay home.");
        }

        else {
            System.out.println("--You don´t have symptoms of coronavirus (COVID-19), you are safety, stay home.--");
        }



    }
}
