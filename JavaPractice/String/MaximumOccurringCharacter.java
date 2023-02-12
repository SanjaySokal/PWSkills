package JavaPractice.String;

public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        String str = "Sanjay Sokal";

        System.out.println("The maximum occurring character in the string is: " + MaxChar(str));
    }

    public static char MaxChar(String str) {
        int[] charCount = new int[256];
        int max = 0;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > max) {
                max = charCount[i];
                result = (char) i;
            }
        }

        return result;
    }
}

