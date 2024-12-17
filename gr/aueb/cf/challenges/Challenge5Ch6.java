package gr.aueb.cf.challenges;

public class Challenge5Ch6 {

    public static void main(String[] args) {

        int[] array = {2, 3, 44, 32};

        DoubleArray(array);
    }

    public static int[] DoubleArray (int[] array) {
        int[] doubleArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = array[i] * 2;
            System.out.println(doubleArray[i]);
        }

        return doubleArray;
    }
}
