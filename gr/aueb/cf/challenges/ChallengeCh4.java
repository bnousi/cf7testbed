package gr.aueb.cf.challenges;

import java.util.Scanner;

public class ChallengeCh4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Please enter a number of stars");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        for (int i = 1; i <= n*n; i++) {
            System.out.print("*");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
