package StreamsFilesAndDirectories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "input.txt";
        FileReader reader = new FileReader(path);
        Scanner scanner = new Scanner(reader);

        PrintStream printStream = new PrintStream("third-line-out.txt");

        int lineNumbers = 0;
        while (scanner.hasNext()) {
            lineNumbers++;
            if (lineNumbers % 3 == 0) {
                printStream.println(scanner.nextLine());
            }else {
                scanner.nextLine();
            }
        }
    }
}
