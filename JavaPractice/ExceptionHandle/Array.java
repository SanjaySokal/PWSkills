package JavaPractice.ExceptionHandle;

public class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int res = 0;

        try {
            res = arr[8];
        } catch (Exception e) {
            System.out.println("Out of array length");
        }

        System.out.println(res);
    }
}
