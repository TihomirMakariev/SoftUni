package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Tihomir\\SoftUni\\JAVA\\KURSOVE\\" +
                "Java Advanced - май 2021\\9 - Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        int nextByte = inputStream.read();

        while (nextByte != -1) {
            System.out.print(Integer.toBinaryString(nextByte) + " ");
            nextByte = inputStream.read();
        }

    }
}
