package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first, second));
                break;
            case "char":
                char a = scanner.nextLine().charAt(0);
                char b = scanner.nextLine().charAt(0);
                System.out.println(getMax(a, b));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }
    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
        // return first > second ? first : second;
    }

    public static char getMax(char first, char second) {
        return first > second ? first : second;
    }

    public static String getMax(String first, String second) {
        return first.compareTo(second) > 0 ? first : second;
    }
}
