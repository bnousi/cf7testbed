package gr.aueb.cf.ch6;

public class JaggedArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[5];    //Το arr του 0 είναι δείκτης
        arr[1] = new int[3];
        arr[2] = new int[6];

        for (int[] row : arr) {
            for (int el : row) {
                System.out.println(el + " ");
            }
            System.out.println();
        }
    }
}
