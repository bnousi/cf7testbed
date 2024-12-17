package gr.aueb.cf.challenges;

public class Challenge6Ch6 {

    public static void main(String[] args) {

        int[] array = {55, 3, 532, 24};

        PositiveNumber(array);
    }

    public static boolean PositiveNumber(int[] arr) {
        boolean IsThereAnyPositiveNumbers = false;
        if (arr == null) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
                IsThereAnyPositiveNumbers = true;
            }
        }
        return IsThereAnyPositiveNumbers;
    }
}
