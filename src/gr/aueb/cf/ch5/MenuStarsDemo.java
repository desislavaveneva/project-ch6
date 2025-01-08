package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuStarsDemo {

    public static void horizontalStars (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void verticalStars (int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void squareStars (int n) {
        for (int i = 0; i < n; i++) {
            horizontalStars(n);
        }
        System.out.println();
    }

    public static void increasingStars (int n) {
        for (int i = 1; i <= n; i++) {
            horizontalStars(i);
        }
        System.out.println();
    }

    public static void decreasingStars (int n) {
        for (int i = n; i >= 1; i--) {
            horizontalStars(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        int n;

        do {
            System.out.println("1. Show n stars horizontally");
            System.out.println("2. Show n stars vertically");
            System.out.println("3. Show n lines with n stars");
            System.out.println("4. Show n lines with stars 1 - n");
            System.out.println("5. Show n lines with stars n - 1");
            System.out.println("6. Exit the program");
            System.out.println("Please, choose one option from the menu:");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.println("Enter the value for n:");
                n = scanner.nextInt();

                switch (choice) {
                    case 1:
                        horizontalStars(n);
                        break;

                    case 2:
                        verticalStars(n);
                        break;

                    case 3:
                        squareStars(n);
                        break;

                    case 4:
                        increasingStars(n);
                        break;

                    case 5:
                        decreasingStars(n);
                        break;
                }
            }
        } while (choice != 6);

        System.out.println("Exiting the program. Thank you for using it!");
    }
}
