package DSA.DArray;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("================");

        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    largest = arr[i][j];
                } else if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }

        System.out.println("largest number is: " + largest);
    }
}
