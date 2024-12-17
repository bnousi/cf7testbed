package gr.aueb.cf.challenges;

import java.util.Scanner;

public class ChallengeCh3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;


        System.out.println("Παρακαλώ, επιλέξτε κάτι από τα παρακάτω.");
        System.out.println("1.Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Επιλέξατε εισαγωγή");
                break;
            case 2:
                System.out.println("Επιλέξατε διαγραφή");
                break;
            case 3:
                System.out.println("Επιλέξατε ενημέρωση");
                break;
            case 4:
                System.out.println("Επιλέξατε αναζήτηση");
                break;
            case 5:
                System.out.println("Αντίο!");
                break;
            default:
                System.out.println("Παρακαλούμε κάντε μία έγκυρη επιλογή");
                break;
        }

    }
}
