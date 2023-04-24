package DSA.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int max = 0;

        int[] arr = { 34, 21, 54, 65, 43 };

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                max = arr[i];
            } else if (max <= arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
