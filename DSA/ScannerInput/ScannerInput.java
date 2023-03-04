package DSA.ScannerInput;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double doub = sc.nextDouble();
        String s = sc.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + doub);
        System.out.println("Int: " + num);

        sc.close();
    }
}
