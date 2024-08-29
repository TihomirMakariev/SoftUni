package Java_Fundamentals.Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        //3 3 6 1
//      List<Double> streamList = Arrays.stream(userInput).map(Double::parseDouble).collect(Collectors.toList());

        Scanner scanner = new Scanner(System.in);
        String[] userInput = scanner.nextLine().split(" ");
        List<Double> numberList = new ArrayList<>();
        for (String stringInput : userInput) {
            numberList.add(Double.parseDouble(stringInput));
        }

        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i).equals(numberList.get(i + 1))) {
                double sum = numberList.get(i) + numberList.get(i + 1);
                numberList.set(i, sum);
                numberList.remove(i + 1);
                i = -1;
            }
        }
        //System.out.println(numberList.toString().replaceAll("[\\[\\],]", ""));

        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numberList){
            System.out.print(decimalFormat.format(number) + " ");
        }
    }
}
