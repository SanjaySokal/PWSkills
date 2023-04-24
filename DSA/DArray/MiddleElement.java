package DSA.DArray;

import java.util.Scanner;

public class MiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        MiddleElement element = new MiddleElement();

        System.out.println("================");
        element.midNum(arr, arr.length);
    }

    void midNum(int[][] arr, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
