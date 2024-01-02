package SetsAndMaps;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, double[]> studentsGrades = new TreeMap<>();


        while (n-- >0){
        String name = scanner.nextLine();
        double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

            studentsGrades.put(name, grades);
        }

        for (var entry : studentsGrades.entrySet()) {
            double avg = Arrays.stream(entry.getValue()).average().orElse(0);
            System.out.printf("%s is graduated with %s%n", entry.getKey(),avg);

        }

    }
}
