package Java_Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class   Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowAndCols = readArray(scanner.nextLine());

        int rows = rowAndCols[0];
        int cols = rowAndCols[1];

        int[][] firstMatrix = readMatrix(rows,cols, scanner);

        rowAndCols = readArray(scanner.nextLine());

        rows = rowAndCols[0];
        cols = rowAndCols[1];

        int[][] secondMatrix = readMatrix(rows,  cols, scanner);

        if (matricesAreEqual(firstMatrix, secondMatrix)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static boolean matricesAreEqual(int[][] first, int[][] second){

        if (first.length != second.length){
            return false;
        }

        for (int row = 0; row < first.length; row++) {
            int[] firstArray = first[row];
            int[]secondArray = second[row];

            if (firstArray.length != secondArray.length){
                return false;
            }
            for (int col = 0; col < firstArray.length; col++) {
                if (firstArray[col] !=secondArray[col]){
                    return false;
                }
            }

         }

        return true;
    }

    public static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine());
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
//        Кодът може да се замени с forEach цикъл

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }

    }

    public static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
