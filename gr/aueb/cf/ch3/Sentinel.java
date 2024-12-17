package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate the positives count
 */
public class Sentinel {

    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = scanner.nextInt();
        while (inputNum >= 0) {
            positivesCount++;
            System.out.println("Please insert a num");
            inputNum = scanner.nextInt();
        }

        System.out.println("Positives count: " + positivesCount);
    }
}
