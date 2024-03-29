package DSA.Sorting;

public class InsertionDescending {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 0 };

        int temp, j;

        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            // temp = 3 && j = 3

            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
