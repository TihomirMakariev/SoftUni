package Java_Advanced.StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        File file =
                new File("C:\\Tihomir\\SoftUni\\JAVA\\KURSOVE\\ +" +
                        "Java Advanced - май 2021\\9 - Streams, Files and Directories\\ +" +
                        "04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] files = file.listFiles();

        for (File f : files) {
            if (!f.isDirectory()){
                System.out.printf("%s: [%d]%n", f.getName(), f.length());
            }

        }
    }
}
