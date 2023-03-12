package JavaPractice.ExceptionHandle;

public class MultipleTryCatch {
    public static void main(String[] args) {
        int res = 0;
        int[] arr = { 1, 2, 3, 4 };

        try {
            res = 10 / 5;
            System.out.println(arr[2]);
        } catch (ArithmeticException e) {
            System.out.println("number cannot be divided by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of array limit");
        }

        System.out.println(res);
    }
}
