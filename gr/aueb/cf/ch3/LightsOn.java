package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on,
 * if it is raining
 * AND car is running (>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert if it is raining.");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if it is dark.");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert the speed.");
        speed = scanner.nextInt();

        lightsOn = (isRaining && isDark) || (isRaining && (speed > 100));

        System.out.println("Turn lights on: " + lightsOn);


    }
}
