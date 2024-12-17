package gr.aueb.cf.ch9;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("/home/barbs/file7-ps.txt")) {

            printMessage(ps, "Hello Coding Factory!");
            printMessage(System.out, "Hello CF!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Generic PrintStream
     *
     * @param ps           the input PrintStream
     * @param message      the input message
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
