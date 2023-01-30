package JavaPractice.Patterns;

public class Rectangle {
    public static void main(String[] args) {
        int arr = 5;
        for (int i = 0; i <= arr; i++) {
            if (i == 0 || i == arr) {
                for (int j = 0; j <= arr; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j <= arr; j++) {
                    if (j == 0 || j == arr) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
}