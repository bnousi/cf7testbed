package gr.aueb.cf.challenges;

import java.util.Scanner;

public class ChallengeCh5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        printMenu();
        choice = getChoice();

    }

    public static void printMenu() {
        System.out.println("Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("Εμφάνισε n αστεράκια κάθετα");
        System.out.println("Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("Εμφάνισε n γραμμές με αστεράκια 1 εώς n");
        System.out.println("Εμφάνισε n γραμμές με αστεράκια n εώς 1");
        System.out.println("Έξοδος από το πρόγραμμα");
        System.out.println("Παρακαλώ επιλέξτε ένα από τα παραπάνω");
    }

    public static int getChoice() {
        return scanner.nextInt();

    }

    public static void showStarsHorizontal() {
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void showStarsVertically() {
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void showStarsNLines() {
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
    }


}