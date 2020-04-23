package Usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Juan David Amezquita Nuñez
     Date: 23/04/2020
     Description: This software records the times of each lap of training and determines the best lap, the average and the number of laps per training.

	 */
	 f_menu();

	 f_procedure();

    }

    public static void f_menu(){
        //Description: Menu
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   Sport time                             ║");
        System.out.println("║   Versión 1.0                            ║");
        System.out.println("║   Created by: Juan David Amezquita Nuñez ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }

    public static boolean f_continue(){
        //Description: this method ask if the user want to continue
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you want to continue the training? (true/false)");
        boolean rta = keyboard.nextBoolean();

        return rta;


    }

    public static void f_procedure(){
        Scanner keyboard = new Scanner(System.in);

        int total_laps = 0;
        double best_lap = 0, average, time_lap, summatory_time = 0;

        while (f_continue()==true){
            total_laps = total_laps + 1;
            time_lap = f_value_lap(total_laps);
            summatory_time = summatory_time + time_lap;

            if (total_laps == 1){
                best_lap = time_lap;
            }else{
                if (best_lap > time_lap){
                    best_lap = time_lap;
                }
            }
        }
        average = summatory_time / total_laps;
        System.out.println("The total time is: "+summatory_time+" seconds.");
        System.out.println("Your best lap was: "+best_lap+" seconds.");
        System.out.println("The average is: "+average+" seconds per lap.");
    }

    public static double f_value_lap(int lap){
        //Description: this method return the time of a lap
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the time in second of the ("+lap+") lap:");
        double time = keyboard.nextDouble();

        while (time < 1){
            System.err.println("Error: the time of the lap must be more than a second");

            System.out.println("Input again the time in second of the ("+lap+") lap:");
            time = keyboard.nextDouble();
        }
        return time;
    }



}
