package gr.aueb.cf.ch3;

import javax.swing.*;
import java.util.Scanner;

/**
 * The program asks a user to give a year and
 * display whether the year is a leap year or not
 */

public class LeapYearProgramDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter an year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d is a leap year.", year);
        } else {
            System.out.printf("%d is not a leap year.", year);
        }
    }
}
