package Java_Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class CenturiesToMinutes_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        double years = (centuries * 1.0) * 100;
        double days = Math.floor(years * 365.2422 );
        double hours = Math.floor(days * 24);
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days,hours,minutes);
    }
}
