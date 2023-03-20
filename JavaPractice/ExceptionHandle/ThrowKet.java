package JavaPractice.ExceptionHandle;

public class ThrowKet {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -5;
        try {
            if (num1 < 0 || num2 < 0) {
                Exception e = new Exception();
                throw e;
            } else {
                int res = num1 / num2;
                System.out.println(res);
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }
    }
}
