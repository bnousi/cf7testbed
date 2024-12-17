package gr.aueb.cf.challenges;

public class Challenge7Ch6 {

    public static void main(String[] args) {
        int[] array = {3, 4, -22, 2};

        AreAllPositives(array);
    }

    public static boolean AreAllPositives ( int[] arr) {
        boolean AreAllPosit = false;

        for (int i : arr) {
            if (i < 0) {
                AreAllPosit = false;
                System.out.println("The elements in the array are not all positives");
                break;
            }
        }

        if (!AreAllPosit) {
            System.out.println("All the elements in the array are positives");
        }

        return AreAllPosit;
    }
}
