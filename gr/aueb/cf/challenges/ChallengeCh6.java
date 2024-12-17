package gr.aueb.cf.challenges;

public class ChallengeCh6 {

    public static void main(String[] args) {
        int[] array = {4, 567, 23, 4, 453};

        MaxInArray(array);
    }

    public static void MaxInArray (int[] arr) {
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        System.out.printf("%d %d", maxPosition, maxValue);
    }
}
