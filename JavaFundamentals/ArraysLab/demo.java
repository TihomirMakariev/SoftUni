package ArraysLab;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = Integer.parseInt(scanner.nextLine());
       String numberAsOneLine = "1 3 21 14";
       String[] numbers = numberAsOneLine.split(" ");

        System.out.println(numbers);
        System.out.println(numbers[1]);

    }
}
