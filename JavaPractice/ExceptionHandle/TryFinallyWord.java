package JavaPractice.ExceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryFinallyWord {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
            // if we don't input a number
        } catch (InputMismatchException e) {
            System.out.println("Please input a number");
        } finally {
            sc.close();
            System.out.println("It will execute on both consitions");
        }
        System.out.println(num);
    }
}
