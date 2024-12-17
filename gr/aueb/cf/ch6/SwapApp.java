package gr.aueb.cf.ch6;

public class SwapApp {

    public static void main(String[] args) {
        int[] arr = {1, 10};
        swap(arr);
        printArray(arr);
    }

    public static void swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.println(el + " ");
        }
    }

    public static class BinarySearch {

        public static void main(String[] args) {

        }

        public static int binarySearch(int [] arr, int value, int low, int high) {
            if (arr == null) return - 1;
            if (low < 0 || high > arr.length - 1) return -1;
            if (low > high) return -1;

            int mid = (low + high) / 2;

            if (arr[mid] == value) return mid;
            if (value > arr[mid]) {
                return binarySearch(arr, value, mid + 1, high);
            } else { // if (value < arr[mid])
                return binarySearch(arr, value, low, mid - 1);
            }
        }
    }
}
