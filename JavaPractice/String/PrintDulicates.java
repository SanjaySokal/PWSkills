package JavaPractice.String;

import java.util.Arrays;

public class PrintDulicates {
    public static void main(String[] args) {
        String str = "Sanjay Sokal";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String rem = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                rem = "" + arr[i];
            }
            if (arr[i] == arr[i + 1]) {
                rem = rem + arr[i + 1];
            }
        }
        System.out.println(rem);
    }
}
