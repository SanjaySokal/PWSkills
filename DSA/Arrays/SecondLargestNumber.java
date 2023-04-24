package DSA.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = { 34, 21, 54, 65, 43 };

        int lastSecond = 0;
        int rem = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                lastSecond = arr[i];
                rem = arr[i];
            } else if (rem <= arr[i]) {
                lastSecond = rem;
                rem = arr[i];
            }
        }

        System.out.println(lastSecond);
    }
}
