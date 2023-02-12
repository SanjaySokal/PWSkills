package JavaPractice.String;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "PWSKILLS";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - 1 - i));
        }
    }
}