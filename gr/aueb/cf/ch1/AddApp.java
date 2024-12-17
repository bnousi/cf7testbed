package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Εντολές εκχώρησης
        result = num1 + num2;

        // Εκτύπωση του αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        // Ο τελεστής "+" έχει το νόημα της συνένωσης - concate
        System.out.printf("Το άθροισμα των %d, %d είναι ίσο με %d\n", num1, num2, result);
        // Το %d ονομάζεται placeholder
        // Το f στο printf σημαίνει formatted

    }
}
