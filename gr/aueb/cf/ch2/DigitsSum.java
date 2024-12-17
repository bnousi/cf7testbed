package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input από τον χρήστη ένa
 * διψήφιο ακέραιο και να υπολογίζει και να
 * εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστης δώσει τον ακέραιο 15,
 * θα πρέπει το αποτέλεσμα να είναι
 * 1 + 5 = 6.
 *
 */
public class DigitsSum {

    public static void main(String[] args) {
        int firstDigit;
        int secondDigit;
        int sumOfDigits;
        int inputNumber;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a two-digit integer.");
        inputNumber = in.nextInt();

        firstDigit = inputNumber / 10;
        secondDigit = inputNumber % 10;
        sumOfDigits = firstDigit + secondDigit;

        System.out.printf("%d + %d = %d", firstDigit, secondDigit, sumOfDigits);

    }
}
