package JavaPractice.String;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Sanjay Sokal";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String rem = "";
        for (int i = 1; i < arr.length; i++) {
            if (i == 1) {
                rem = rem + arr[i - 1];
            }
            if (arr[i] != arr[i - 1]) {
                rem = rem + arr[i];
            }
        }
        System.out.println(rem);
    }
}
