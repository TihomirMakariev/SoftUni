package Java_Advanced.MultidimensionalArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 0;

        List<List<Integer>> matrix = new ArrayList<>();
        for (int l = 0; l < input[0]; l++)  {
            List<Integer> innerString = new ArrayList<>();
            for (int i = 0; i < input[1]; i++) {
                counter++;
                innerString.add(counter);
            }
            matrix.add(innerString);
        }

        String[] command;
        while (!"Nuke".equals((command = scanner.nextLine().split(" "))[0])) {

            int row = Integer.parseInt(command[0]),
                    col = Integer.parseInt(command[1]),
                    radius = Integer.parseInt(command[2]);

            if (row < matrix.size() && row >= 0) { // HORIZONTAL BOOM
                for (int k = Math.min(matrix.get(row).size() - 1, col + radius); k >= Math.max(col - radius, 0); k--) {
                    matrix.get(row).remove(k);
                }
            }

            // Vertical Boom
            if (col < matrix.size() && col >= 0) {
                for (int k = Math.max(0, row - radius); k <= Math.min(matrix.size() - 1, row + radius); k++) {
                    if (k != row && (matrix.get(k).size() > col)) {
                        matrix.get(k).remove(col);
                    }
                }
            }
            if (row < matrix.size() && row >= 0) {
                if (matrix.get(row).isEmpty()) {
                    matrix.remove(row);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        matrix.forEach(e -> {
            e.forEach(b -> sb.append(b).append(" "));
            sb.append(System.lineSeparator());
        });
        System.out.print(sb);
    }
}
