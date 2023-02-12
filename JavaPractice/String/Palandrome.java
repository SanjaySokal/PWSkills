package JavaPractice.String;

public class Palandrome {
    public static void main(String[] args) {
        String str = "2552";

        String strRev = "";
        for (int i = 0; i < str.length(); i++) {
            strRev = strRev + str.charAt(str.length() - i - 1);
        }

        if(strRev == str) {
            System.out.println("The String is Palandrome");
        }
    }
}
