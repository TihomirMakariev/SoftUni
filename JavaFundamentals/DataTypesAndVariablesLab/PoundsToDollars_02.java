package DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double exchangeCourse = 1.31;
        double dollars = pounds * exchangeCourse;

        System.out.printf("%.3f", dollars);
    }
}