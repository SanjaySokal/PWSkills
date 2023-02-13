package JavaPractice.String;

public class RemvDupli {
    public static void main(String[] args) {
        String str = "SanjaySokal";
        char[] name = str.toCharArray();
        System.out.println(name);

        char rem = ' ';
        String last = "";
        for (int i = 0; i < name.length; i++) {
            for (int j = i; j < name.length - 1; j++) {
                if (i == 0) {
                    rem = name[i];
                    last = "" + rem;
                    // s
                } else {
                    // a
                    if (rem != name[j]) {
                        last = last + name[j];
                        rem = name[j];
                    }
                }
            }
        }
        System.out.println(last);
    }
}