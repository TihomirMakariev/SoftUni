package Java_Fundamentals.ExamPreparation2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Ivan", 123);
        phonebook.put("Ivan4o", 123);
        phonebook.remove("Ivan4o");


        System.out.println(phonebook.get("Ivan"));
    }
}
