package gr.aueb.cf.challenges;

import java.util.Scanner;

public class ChallengeCh2_ {

    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int tempYear = 0;
        int year = 0;
        int date = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert 3 integers");
        day = scanner.nextInt();
        month = scanner.nextInt();
        tempYear = scanner.nextInt();

        year = tempYear / 100;
        year = tempYear % 100;
        System.out.printf("Date: %02d/%d/%d\n", day, month, year);
    }
}
