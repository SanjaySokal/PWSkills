package JavaPractice.String;

public class RevSantance {
    public static void main(String[] args) {
        String input = "Think Twice";

        char[] characters = input.toCharArray();
        String reversed = "";

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i];
        }

        System.out.println("The reversed string is: " + reversed);
    }
}
