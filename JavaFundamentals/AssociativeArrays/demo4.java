package AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = new ArrayList<>();
        numbers.add("42.4");
        numbers.add("13");
        numbers.add("68.8");
        numbers.add("111");
        numbers.add("256.3");
        double sum = numbers.stream().mapToDouble(i->Double.parseDouble(i)).sum();


        System.out.println(sum);


    }
}
