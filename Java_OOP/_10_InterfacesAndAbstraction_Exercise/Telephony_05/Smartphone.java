package Java_OOP._10_InterfacesAndAbstraction_Exercise.Telephony_05;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    List<String> numbers = new ArrayList<>();
    List<String> urls = new ArrayList<>();


    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call(String number) {
        // Проверка дали номерът съдържа символи, различни от цифри
        if (number.matches("\\d+")) {
            return "Calling... " + number;
        } else {
            return "Invalid number!";
        }
    }

    public void callAll() {
        for (String number : numbers) {
            System.out.println(call(number));
        }
    }

    @Override
    public String browse(String url) {
        // Проверка дали URL-ът съдържа цифри
        if (url.matches(".*\\d.*")) {
            return "Invalid URL!";
        } else {
            return "Browsing: " + url + "!";
        }
    }

    public void browseAll() {
        for (String urls : urls) {
            System.out.println(browse(urls));
        }
    }
}
