package DSA.DArray;

import java.util.Scanner;

public class PrintDiagonalSqure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("======================================");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                break;
            }

            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[i][arr.length - j - 1] + " ");
                break;
            }
        }
    }
}
