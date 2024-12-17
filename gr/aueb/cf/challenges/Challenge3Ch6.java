package gr.aueb.cf.challenges;

public class Challenge3Ch6 {

    public static void main(String[] args) {
        int[] array = {2, 3, 32};
        int value = 32;

        System.out.println(getElementPosition(array, value));
    }

    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return value;
            }
        }

        return -1;
    }
}
