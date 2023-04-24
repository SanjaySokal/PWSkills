package DSA.Arrays;

public class findPeakElement {
    public static void main(String[] args) {
        findPeakElement element = new findPeakElement();
        int[] arr = { 1, 4, 7, 3, 2, 6, 5 };

        System.out.println(element.findPeak(arr));
    }

    String findPeak(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return "the element is " + arr[i];
            }
        }
        return "error";
    }
}
