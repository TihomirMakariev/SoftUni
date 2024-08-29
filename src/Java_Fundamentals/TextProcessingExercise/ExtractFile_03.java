package Java_Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //C:\Internal\training-internal\Template.pptx
        String path = scanner.nextLine();
        String[] pathParts = path.split("\\\\");
        String fullFIleName = pathParts[pathParts.length - 1];
        String fileName = fullFIleName.split("\\.")[0];
        String extension = fullFIleName.split("\\.")[1];
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);

    }
}
