package JavaPractice.Patterns;

public class PWSkills {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == 6) {
                    System.out.print("* ");
                } else if (j == 0 || j == 6) {
                    System.out.print("* ");
                } else if (i == 3 && j == 3) {
                    System.out.print("PW ");
                } else if (i == 3 && j == 4) {
                    System.out.print("SK ");
                } else if (i == 3 && j == 5) {
                    System.out.print("IL ");
                } else if (i == 3 && j == 6) {
                    System.out.print("LS ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
