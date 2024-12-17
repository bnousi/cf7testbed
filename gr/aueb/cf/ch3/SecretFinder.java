package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένας SECRET  integer και ο χρήστης
 * προσπαθεί με μία μόνο προσπάθεια να τον βρει
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Please insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found");
        } else {
            System.out.println("You are a dumb loser");
        }
    }
}
