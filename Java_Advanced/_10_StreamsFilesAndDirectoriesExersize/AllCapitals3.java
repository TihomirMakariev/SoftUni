package Java_Advanced._10_StreamsFilesAndDirectoriesExersize;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AllCapitals3 {
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i++) {
            File file = new File("C:\\Users\\Tihomir-PC\\Desktop\\100_files\\file_" + i + ".txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(file.getName());
            writer.write("\n");
            writer.write(file.getPath());
            writer.close();
        }
    }
}
