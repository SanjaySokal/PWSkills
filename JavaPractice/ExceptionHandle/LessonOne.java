package JavaPractice.ExceptionHandle;

public class LessonOne {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
        }
        System.out.println(result);
    }
}
