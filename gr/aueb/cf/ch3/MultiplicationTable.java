package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνει ως output τον πολλαπλασιασμό ενός ακεραίου που δίνει ο χρήστης
 * με όλους τους ακεραίους από 1 έως 10.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Please enter an integer");
        num = scanner.nextInt();

        while (i <= 10) {
            System.out.printf("%d * %d = %d", num, i, num * i);
            System.out.println();
            i++;
        }
    }
}
