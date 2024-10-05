package Java_Advanced._09_StreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ADemo {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("input.txt");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String line = reader.readLine();

        List<String> lines = new ArrayList<>();

        while (line != null){
            lines.add(line);
            line = reader.readLine();
        }
        Collections.sort(lines);

        System.out.println(String.join(System.lineSeparator(), lines));
    }
}
