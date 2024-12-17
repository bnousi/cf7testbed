package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18.
 * Ελέγχει αν μία ηλικία
 * έχει δικαίωμα να ψηφίσει.
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int VOTING_AGE = 18;
        boolean isEligible = false;
        int inputAge = 0;

        System.out.println("Please insert your age");
        inputAge = scanner.nextInt();

        isEligible = inputAge >= VOTING_AGE;

        System.out.printf("%d years old. You can vote: %b", inputAge, isEligible);
    }
}
