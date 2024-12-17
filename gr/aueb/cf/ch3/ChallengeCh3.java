package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ChallengeCh3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear;
        boolean isLeapYear = false;


        System.out.println("Please enter a year");
        inputYear = scanner.nextInt();

        isLeapYear = ( inputYear % 4 == 0 && inputYear % 100 != 0 ) || ( inputYear % 400 == 0 );
        System.out.println("It is a leap year: " + isLeapYear);
    }
}
