package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DisplayDateApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        System.out.println("Please, insert day, month, and year: ");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("The date is:\n %d/%d/%d", day, month, year);

    }
}
