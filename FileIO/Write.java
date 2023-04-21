package FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {
        File file = new File("JavaFile.txt");
        FileWriter fw = new FileWriter(file, true);

        fw.write("\n");
        fw.write("Hello I am working in this file");
        fw.write("\n");
        fw.write(45);
        fw.write("\n");
        fw.write(55);

        fw.close();
    }
}
