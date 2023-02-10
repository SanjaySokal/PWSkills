package JavaPractice.String;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(name);
    }
}