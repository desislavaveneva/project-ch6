package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuProgramDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("1. Introduction");
            System.out.println("2. Deletion");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.println("Please, choose one of the following options:\n");

            choice = scanner.nextInt();

            if (choice < 0 || choice > 5) {
                System.out.println("Please, select a number between 1 and 5!");
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("Select Import \n");
                        break;
                    case 2:
                        System.out.println("Delete Import \n");
                        break;
                    case 3:
                        System.out.println("Update Import \n");
                        break;
                    case 4:
                        System.out.println("Search Import \n");
                        break;
                    case 5:
                        System.out.println("Exit! \n");
                        break;
                }
            }
        } while (choice != 5);

        System.out.println("Thank you for using the menu!");


    }
}
