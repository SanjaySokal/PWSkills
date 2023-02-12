package JavaPractice.String;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        String str = "Sanjay Sokal";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        System.out.println(arr);
    }
}
