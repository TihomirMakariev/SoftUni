package Java_Advanced.StreamsFilesAndDirectoriesExersize;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = ("C:\\Tihomir\\SoftUni\\java\\KURSOVE\\" +
                "Java Advanced - май 2021\\10 - Streams, Files and Directories - Exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources");
        File folder = new File(path);

        int folderSize = 0;
        for (File file : folder.listFiles()) {
            folderSize += file.length();
        }

        System.out.println("Folder size:" + folderSize);

    }
}
