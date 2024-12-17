package gr.aueb.cf.challenges;

public class Challenge2Ch6 {

    public static void main(String[] args) {
        int[] array = {3, 35, 2, 483, 44};

        SecondMaxInArray(array);
    }

    public static void SecondMaxInArray (int[] arr) {
        int maxPosition = 0;
        int maxValue = 0;
        int secondMaxPosition = 0;
        int secondMaxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxValue && arr[i] > secondMaxValue) {
                secondMaxPosition = i;
                secondMaxValue = arr[secondMaxPosition];
            }
        }

        System.out.printf("%d %d", secondMaxValue, secondMaxPosition);
    }
}
