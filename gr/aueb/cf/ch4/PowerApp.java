package gr.aueb.cf.ch4;

/**
 * Calculates a^n.
 * E.g 2^10 = 1024.
 */
public class PowerApp {

    public static void main(String[] args) {
        int base = 2;
        int power = 10;
        int result = 1;

        //for to calculate base ^ power.

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println("Result: " + result);
    }
}
