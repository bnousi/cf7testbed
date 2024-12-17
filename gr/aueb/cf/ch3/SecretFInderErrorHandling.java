package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * Υπάρχει ένας SECRET  integer και ο χρήστης
 * προσπαθεί με μία μόνο προσπάθεια να τον βρει.
 * Check errors first.
 */
public class SecretFInderErrorHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean isSuccess = false;

        while (true) {
            System.out.println("Please insert a num to guess the secret");
            num = scanner.nextInt();

            if (num != SECRET) {
                System.out.println("Try again, dumb loser!");
                continue;
            }

            System.out.println("Bingo!");
            break;
        }
    }
}
