package gr.aueb.cf.ch4;

import java.util.Scanner;

public class VerticalStars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Please, insert a number:");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

        System.out.println();
        System.out.println("Thank you!");
    }
}
