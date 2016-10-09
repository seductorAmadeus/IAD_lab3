package com.amadeus.IAD.Lab3;
// variant 30103

import java.util.Scanner;

public class Lab3 {

    private static Scanner in = new Scanner(System.in);
    private static boolean actionWasSuccessfully = false;

    public static void main(String[] args) {
        while (!actionWasSuccessfully) {
            printMenuItems();
            switch (in.nextLine()) {
                case "1": {
                    runCheck(getRadius());
                    actionWasSuccessfully = true;
                }
                case "2":
                    Runtime.getRuntime().exit(0);
                    break;
                default:
                    System.out.println("Re-enter menu item, please\n");
            }
        }
    }

    private static void printMenuItems() {
        System.out.println("1. Enter new radius \n" +
                "2. Exit\n");
    }

    private static double getRadius() {
        double R;
        while (true) {
            try {
                System.out.println("Enter radius, please: ");
                R = Double.valueOf(in.nextLine());
                break;
            } catch (NumberFormatException exp) {
                System.out.println("Format error, re-enter radius ");
            }
        }
        return R;
    }

    private static void runCheck(double R) {

    }
}