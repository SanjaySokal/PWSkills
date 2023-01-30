package JavaPractice.Patterns;

public class Triangle {
    public static void main(String[] args) {
        int length = 6;
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= length; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
