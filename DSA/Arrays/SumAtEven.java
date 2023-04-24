package DSA.Arrays;

public class SumAtEven {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 6, 7, 1 };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println(sum);
    }
}
