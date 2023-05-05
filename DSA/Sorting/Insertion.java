package DSA.Sorting;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 6, 8, 4, 7, 9, 3, 0 };

        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            // temp = 6
            // j = 2

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
            // j + 1 = 3
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
