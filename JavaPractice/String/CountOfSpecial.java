package JavaPractice.String;

public class CountOfSpecial {
    public static void main(String[] args) {
        String str = "Sanjay Sokal is my Name! My phone Number is 8295673601";

        int vowels = 0, constants = 0, specialChars = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch ==  'O' || ch == 'U') {
                vowels++;
            }

            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                constants++;
            }

            else {
                specialChars++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of constants: " + constants);
        System.out.println("Number of special characters: " + specialChars);
    }
}
