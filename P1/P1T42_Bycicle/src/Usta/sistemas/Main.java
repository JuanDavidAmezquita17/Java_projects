package Usta.sistemas;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Author: Juan David Amezquita Nuñez
	   Date: 30/03/2020
	   Description: This software calculate the time that a person spend from one city to other.
	 */
	Scanner keyboard = new Scanner(System.in);

        System.out.println("---------------------------------Bicycle------------------------------");
        System.out.println("---------------Created by: Juan David Amezquita Nuñez-----------------");
        System.out.println("This software determinate the time that you spend from Tunja to Oicata");
        System.out.println("----------------------------------------------------------------------");

        String name;
        double time, speed, km;

        System.out.println("Please enter your name");
        name = keyboard.nextLine();

        if ( name == ""){
            System.err.println("ERROR: you must input your name");
        }

        System.out.println("Please enter the speed that you will have in km/h:");
        speed = keyboard.nextInt();

        km = 20;

        time = km/speed;

        if (speed<=0 || speed>19) {
            System.err.println("ERROR: Well in bicycle a person cannot go to more than 19 km/h, and you cannot go lower than 0 km/h");
        }
        else {
            System.out.println(name+", the time you will spend at "+speed+" km/h, is: "+time+" hrs");
        }

        System.out.println("Thanks for use this software "+name);


    }
}
