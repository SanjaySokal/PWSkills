package DSA.DArray;

import java.util.Scanner;

public class FindNumbersBy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int positiveNum = 0, negativeNum = 0, oddNum = 0, evenNum = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > 0) {
                    positiveNum++;
                }

                if (arr[i][j] < 0) {
                    negativeNum++;
                }

                if (arr[i][j] % 2 != 0) {
                    oddNum++;
                }

                if (arr[i][j] % 2 == 0) {
                    evenNum++;
                }

                if (arr[i][j] == 0) {
                    zero++;
                }
            }
        }

        System.out.println("number of positive numbers " + positiveNum);
        System.out.println("number of negative numbers " + negativeNum);
        System.out.println("number of odd numbers " + oddNum);
        System.out.println("number of even numbers " + evenNum);
        System.out.println("number of zero numbers " + zero);
    }
}