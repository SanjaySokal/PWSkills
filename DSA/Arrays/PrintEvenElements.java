package DSA.Arrays;

public class PrintEvenElements {
    public static void main(String[] args) {
        int arr[] = { 34, 21, 54, 65, 43 };

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
