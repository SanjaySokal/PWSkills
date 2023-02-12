package JavaPractice.String;

public class PanagramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();

        char[] a2z = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };

        boolean check = false;
        for (int i = 0; i < a2z.length; i++) {
            if (str.contains("" + a2z[i])) {
                // System.out.println("True");
                check = true;
            } else {
                check = false;
                break;
            }
        }

        System.out.println(check);
    }
}
