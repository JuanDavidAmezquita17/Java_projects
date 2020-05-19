package Usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int secondsAfter15 = 0;
        for (int i = 0; i < 30; i = i + 1) {
            secondsAfter15 = secondsAfter15 + 1;
        }
        secondsAfter15 = secondsAfter15 * 60;
        System.out.println(secondsAfter15);
    }
}
