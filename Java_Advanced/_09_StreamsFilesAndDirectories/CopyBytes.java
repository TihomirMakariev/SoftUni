package Java_Advanced._09_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Set<Character> separators = Set.of(' ', '\r', '\n');

        int nextByte = inputStream.read();

        PrintStream printStream = new PrintStream("copy-byte-out.txt");

        while (nextByte != -1) {
            if (nextByte == ' ') {
                printStream.print((char) nextByte);
            } else if (nextByte == 10)  {
                printStream.println();

            } else {
                printStream.print(nextByte);
            }
            nextByte = inputStream.read();
        }
    }
}
