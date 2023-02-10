package JavaPractice.String;

public class DeleteConstants {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        str = str.replace("a", "");
        str = str.replace("A", "");

        str = str.replace("e", "");
        str = str.replace("E", "");

        str = str.replace("i", "");
        str = str.replace("I", "");

        str = str.replace("o", "");
        str = str.replace("O", "");
        
        str = str.replace("u", "");
        str = str.replace("U", "");

        System.out.println(str);
    }
}
