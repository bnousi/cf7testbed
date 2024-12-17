package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένας SECRET  integer και ο χρήστης
 * προσπαθεί με μία μόνο προσπάθεια να τον βρει - με while.
 */
public class SecretWhileFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        do {
            System.out.println("Please insert a num to guess the secret");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Secret found!");
                isSuccess = true;
            } else {
                System.out.println("Try again, dumb loser!");
            }
        }  while (!isSuccess);
    }
}
