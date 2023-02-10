package JavaPractice.String;

public class ContainsString {
    public static void main(String[] args) {
        String text = "Umbrella";

        Boolean check = false;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'e') {
                check = true;
            }
        }

        System.out.println(check);
    }
}
