package JavaPractice.String;

public class UniqueCharacterCheck {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        boolean[] charSeen = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int index = ch - 'a';
            if (charSeen[index]) {
                break;
            } else {
                charSeen[index] = true;
            }
        }

        boolean isUnique = true;
        for (boolean seen : charSeen) {
            if (!seen) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            System.out.println("The string contains all unique characters.");
        } else {
            System.out.println("The string does not contain all unique characters.");
        }
    }
}
