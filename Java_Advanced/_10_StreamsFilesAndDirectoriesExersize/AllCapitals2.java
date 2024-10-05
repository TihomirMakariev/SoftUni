package Java_Advanced._10_StreamsFilesAndDirectoriesExersize;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AllCapitals2 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Tihomir\\SoftUni\\java\\KURSOVE\\" +
                "Java Advanced - май 2021\\10 - Streams, Files and Directories - Exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (NoSuchFileException e) {
            System.out.println("There is no such file on this path");
        } catch (IOException io) {
            System.out.println("Another error with reading file");
        }

        try {
            File file = new File("C:\\Users\\Tihomir-PC\\Desktop\\outputfile.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String line : lines) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
