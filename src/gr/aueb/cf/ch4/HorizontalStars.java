package gr.aueb.cf.ch4;

import java.util.Scanner;

public class HorizontalStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, insert number of stars:");
       int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Thank you!");
    }
}
