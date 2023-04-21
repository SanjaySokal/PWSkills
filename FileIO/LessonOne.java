package FileIO;

import java.io.File;
import java.io.IOException;

public class LessonOne {
    public static void main(String[] args) {
        File file = new File("JavaFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());
    }
}