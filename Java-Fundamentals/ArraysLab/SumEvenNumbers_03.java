package ArraysLab;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();

        String[] items = values.split(" ");
        int[] arr = new int[items.length];
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            arr[i] = Integer.parseInt(items[i]);
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }
}
