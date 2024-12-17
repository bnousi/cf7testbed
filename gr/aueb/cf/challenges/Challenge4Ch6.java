package gr.aueb.cf.challenges;

public class Challenge4Ch6 {

    public static void main(String[] args) {
        int[] array = {1, 34, 22, 45, 3};

        EvenNumbersInArray(array);
    }

    public static void EvenNumbersInArray (int[] arr) {
        if (arr == null) System.out.println("The array is empty!");;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
