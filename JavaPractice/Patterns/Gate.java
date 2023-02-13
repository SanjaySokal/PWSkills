package JavaPractice.Patterns;

public class Gate {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= 1 + rows - i; j--) {
                System.out.print('*');
            }

            for (int j = i * 2; j < rows * 2 - 1; j++) {
                System.out.print(" ");
            }

            for (int l = 1 + rows - i; l <= rows; l++) {
                if (l != 1)
                    System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print("* ");
                } else if (j == 0 || j == 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
