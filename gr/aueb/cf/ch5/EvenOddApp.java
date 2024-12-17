package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Delegation Design Pattern
     * @param num
     * @return
     */
    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}
