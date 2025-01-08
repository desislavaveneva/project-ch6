package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsFromNToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Please, insert a number:");
        n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Thank you!");
    }
}
