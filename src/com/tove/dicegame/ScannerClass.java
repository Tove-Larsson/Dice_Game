package com.tove.dicegame;

import java.util.Scanner;

public class ScannerClass {

    static Scanner scan = new Scanner(System.in);

    public static int getInt (int minValue) {
        while (true) {
            if (scan.hasNextInt()) {
                int inputInt = scan.nextInt();
                clear();
                if (inputInt >= minValue) {
                    return inputInt;
                }
                else {
                    System.out.println("Must be higher than " + (minValue - 1));
                }
            } else {
                System.out.println("The input has to be a number");
                clear();
            }
        }
    }

    public static String getString() {
        return scan.nextLine();

    }

    public static void clear () {
        scan.nextLine();
    }

}
