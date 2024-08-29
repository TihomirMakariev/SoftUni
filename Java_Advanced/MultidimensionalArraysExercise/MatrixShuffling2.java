package Java_Advanced.MultidimensionalArraysExercise;

import java.util.Scanner;

public class MatrixShuffling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowAndCol = readArray(scanner.nextLine());
        String[][] matrix = readMatrix(Integer.parseInt(rowAndCol[0]), Integer.parseInt(rowAndCol[1]), scanner);

        String command = scanner.nextLine();

        while(!command.equals("END")){
            String[] swap = command.split("\\s+");
            if(swap.length != 5 || !swap[0].equals("swap")){
                System.out.println("Invalid input!");
            }
            else if((Integer.parseInt(swap[1]) > Integer.parseInt(rowAndCol[0]) - 1 || Integer.parseInt(swap[1]) < 0)||(Integer.parseInt(swap[3]) > Integer.parseInt(rowAndCol[0]) - 1 || Integer.parseInt(swap[3]) < 0)){
                System.out.println("Invalid input!");
            }
            else if((Integer.parseInt(swap[2]) > Integer.parseInt(rowAndCol[1]) || Integer.parseInt(swap[2]) < 0)||(Integer.parseInt(swap[4]) > Integer.parseInt(rowAndCol[1]) - 1 || Integer.parseInt(swap[4]) < 0)){
                System.out.println("Invalid input!");
            }
            else {
                swapElements(matrix, swap);
            }
            command = scanner.nextLine();
        }
    }

    private static void swapElements(String[][] matrix, String[] swap) {
        int firstRow = Integer.parseInt(swap[1]);
        int firstCol = Integer.parseInt(swap[2]);
        int secondRow = Integer.parseInt(swap[3]);
        int secondCol = Integer.parseInt(swap[4]);

        String n = matrix[firstRow][firstCol];
        matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
        matrix[secondRow][secondCol] = n;
        printMatrix(matrix);
    }

    public static String[][] readMatrix(int row,int col,Scanner vm){
        String[][] matrix = new String[row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = readArray(vm.nextLine());
        }
        return matrix;
    }
    public static String[] readArray(String line){
        return line.split("\\s+");
    }    public static void printMatrix(String[][] matrix){
        for (String[] arr:matrix) {
            for (String element:arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}