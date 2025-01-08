package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit;
        final int CELSIUS;

        System.out.println("Please, insert the temperature in Fahrenheit: ");
        fahrenheit = in.nextInt();
        CELSIUS = 5 * (fahrenheit - 32) / 9;

        System.out.printf("The temperature %d in Fahrenheit is equal to %d in Celsius.\n", fahrenheit,CELSIUS);
    }
}
