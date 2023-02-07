package JavaPractice.String;

public class StringPract2 {
    public static void main(String[] args) {
        String s = new String("New");
        String s1 = new String("New");
        String s2 = "New";
        String s3 = "New";
        System.out.println(s3 == s2);
        System.out.println(s == s1);
        System.out.println(s1 == s2);
    }
}
