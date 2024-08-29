package Java_Fundamentals.MethodsLab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = 'a';
        char b = 'b';

    }

    public static void printMax(char a, char b) {
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("Equal");
        }
    }

}
