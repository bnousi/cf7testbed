package gr.aueb.cf.challenges;

import java.util.Scanner;

public class ChallengeCh2 {

    public static void main(String[] args) {
        int fahrenheitTemp = 0;
        int celsiusTempt = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fahrenheit temperature: ");
        fahrenheitTemp = scanner.nextInt();

        celsiusTempt = 5 * (fahrenheitTemp - 32) / 9;

        System.out.printf("Celsius temperature: %d\n" ,celsiusTempt);

    }
}
