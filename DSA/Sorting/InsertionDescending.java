package DSA.Sorting;

public class InsertionDescending {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 6, 0 };
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j < arr.length - 1 - i; j++) {
                int temp = 0;
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
