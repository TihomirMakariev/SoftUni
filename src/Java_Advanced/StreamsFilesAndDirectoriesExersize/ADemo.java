package Java_Advanced.StreamsFilesAndDirectoriesExersize;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class ADemo {
    public static void main(String[] args) {
//        String path = "C:\\Tihomir\\SoftUni\\java\\KURSOVE\\Java Advanced - май 2021\\10 - Streams, Files and Directories - Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path path = Path.of("C:\\Tihomir\\SoftUni\\java\\KURSOVE\\Java Advanced - май 2021\\10 - Streams, Files and Directories - Exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (NoSuchFileException e) {
            System.out.println("There is no such file on this path");
        } catch (IOException io) {
            System.out.println("Another error with reading file");
        }

        for (String line : lines) {
            printSumSymbolOfAscii(line);
        }
    }


    private static void printSumSymbolOfAscii(String line) {
        int sum = 0;
        for (char symbol : line.toCharArray()) {
            sum += symbol;
        }
        System.out.println(sum);
    }
}
