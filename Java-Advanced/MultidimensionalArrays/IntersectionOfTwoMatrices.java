package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] first = readMatrix(rows, cols, scanner);
        char[][] second = readMatrix(rows, cols, scanner);

        char[][] result = getMatricesIntersection(first, second);

        printMatrix(result);

    }

    public static char[][] getMatricesIntersection(char[][] first, char[][] second) {
        char[][] out = new char[first.length][];

        for (int row = 0; row < first.length; row++) {
            out[row] = new char[first[row].length];
            for (int col = 0; col < first[row].length; col++) {
                out[row][col] = first[row][col] == second[row][col]
                        ? first[row][col] : '*';
            }
        }

        return out;
    }

    public static char[][] readMatrix(int rows, int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            for (int col = 0; col < tokens.length; col++) {
                matrix[row][col] = tokens[col].charAt(0);
            }

        }
        return matrix;
    }

    public static boolean matricesAreEqual(int[][] first, int[][] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int row = 0; row < first.length; row++) {
            int[] firstArray = first[row];
            int[] secondArray = second[row];

            if (firstArray.length != secondArray.length) {
                return false;
            }

            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[col] != secondArray[col]) {
                    return false;
                }
            }
        }

        return true;
    }

//    public static int[][] readMatrix(int rows, int cols, Scanner scanner) {
//        int[][] matrix = new int[rows][cols];
//
//        for (int row = 0; row < rows; row++) {
//            matrix[row] = readArray(scanner.nextLine());
//        }
//        return matrix;
//    }

    public static void printMatrix(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
