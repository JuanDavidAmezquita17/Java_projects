package Usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Juan David Amezquita Nuñez
      Date: 30/04/2020
      Description: this software simulates a coffee machine
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        f_menu();

        int m_bill = f_bill();

        f_menu_2();
        System.out.println(" ");
        System.out.println("Select your product: ");
        int product = keyboard.nextInt();

        while (product <= 0 || product >= 6) {
            System.err.println("Error: invalid product");
            System.out.println("Please select a product: ");
            product = keyboard.nextInt();
        }

        System.out.println("Do you want sugar(true/false)?");
        boolean sugar = keyboard.nextBoolean();


        if (product == 1) {
            f_aromatica(m_bill, sugar);
        } else {
            if (product == 2) {
                f_cafe_negro(m_bill, sugar);
            } else {
                if (product == 3) {
                    f_cafe_con_leche(m_bill, sugar);
                } else {
                    if (product == 4) {
                        f_capuchino(m_bill, sugar);
                    } else {
                        f_mocachino(m_bill, sugar);
                    }
                }
            }
        }


    }

    public static void f_menu() {
        //Description: first menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Coffee machine                         ║");
        System.out.println("║   Version 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static void f_menu_2() {
        //Description: second menu
        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║       Product        ║        Value        ║     Time of creation      ║       Number         ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║══════════════════════║");
        System.out.println("║      Aromática:      ║        $1.300       ║           30 s            ║         1            ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║══════════════════════║");
        System.out.println("║      Café negro:     ║        $1.000       ║           30 s            ║         2            ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║══════════════════════║");
        System.out.println("║    Café con leche:   ║        $1.900       ║           45 s            ║         3            ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║══════════════════════║");
        System.out.println("║      Capuchino:      ║        $2.500       ║           60 s            ║         4            ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║══════════════════════║");
        System.out.println("║      Mocachino:      ║        $2.700       ║           70 s            ║         5            ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════╝");
    }

    public static int f_bill() {
        //Description: This method ask for the bill
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("What is the value of the money bill that you are going to deposit?");
        int m_bill = keyboard.nextInt();

        return m_bill;

    }

    public static void f_aromatica(int m_bill, boolean sugar) {
        //Description: process for the aromatica
        int value = 1300;

        while (m_bill < 1300) {
            System.err.println("Error: sorry, but you don't have the enough money for this product");
            System.out.println("You must input ($" + (value - m_bill) + ") more");
            m_bill = m_bill + f_bill();
        }

        int surbill = m_bill - value;

        System.out.println("Product: aromática");
        System.out.println("Time of creation: 30 s");
        System.out.println(" ");
        System.out.println("Sugar: " + sugar);
        System.out.println(" ");
        System.out.println("Turns money: " + surbill);

        System.out.println("Thanks for use the coffee machine");

    }

    public static void f_cafe_negro(int m_bill, boolean sugar) {
        //Description: process for the cafe negro
        int value = 1000;

        while (m_bill < value) {
            System.err.println("Error: sorry, but you don't have the enough money for this product");
            System.out.println("You must input ($" + (value - m_bill) + ") more");
            m_bill = m_bill + f_bill();
        }

        int surbill = m_bill - value;

        System.out.println("Product: aromática");
        System.out.println("Time of creation: 30 s");
        System.out.println(" ");
        System.out.println("Sugar: " + sugar);
        System.out.println(" ");
        System.out.println("Turns money: " + surbill);

        System.out.println("Thanks for use the coffee machine");
    }

    public static void f_cafe_con_leche(int m_bill, boolean sugar) {
        //Description: process for cafe con leche
        int value = 1900;

        while (m_bill < value) {
            System.err.println("Error: sorry, but you don't have the enough money for this product");
            System.out.println("You must input ($" + (value - m_bill) + ") more");
            m_bill = m_bill + f_bill();
        }

        int surbill = m_bill - value;

        System.out.println("Product: aromática");
        System.out.println("Time of creation: 45 s");
        System.out.println(" ");
        System.out.println("Sugar: " + sugar);
        System.out.println(" ");
        System.out.println("Turns money: " + surbill);

        System.out.println("Thanks for use the coffee machine");
    }

    public static void f_capuchino(int m_bill, boolean sugar) {
        //Description: process for the capuchino
        int value = 2500;

        while (m_bill < value) {
            System.err.println("Error: sorry, but you don't have the enough money for this product");
            System.out.println("You must input ($" + (value - m_bill) + ") more");
            m_bill = m_bill + f_bill();
        }

        int surbill = m_bill - value;

        System.out.println("Product: aromática");
        System.out.println("Time of creation: 60 s");
        System.out.println(" ");
        System.out.println("Sugar: " + sugar);
        System.out.println(" ");
        System.out.println("Turns money: " + surbill);

        System.out.println("Thanks for use the coffee machine");
    }

    public static void f_mocachino(int m_bill, boolean sugar) {
        //Description: process for the capuchino
        int value = 2700;

        while (m_bill < value) {
            System.err.println("Error: sorry, but you don't have the enough money for this product");
            System.out.println("You must input ($" + (value - m_bill) + ") more");
            m_bill = m_bill + f_bill();
        }

        int surbill = m_bill - value;

        System.out.println("Product: aromática");
        System.out.println("Time of creation: 70 s");
        System.out.println(" ");
        System.out.println("Sugar: " + sugar);
        System.out.println(" ");
        System.out.println("Turns money: " + surbill);

        System.out.println("Thanks for use the coffee machine");
    }


}
