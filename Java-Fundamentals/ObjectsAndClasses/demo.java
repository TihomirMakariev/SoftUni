package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Random myRandom = new Random();
        int myRandomNumber = myRandom.nextInt(10);
        System.out.println(myRandomNumber);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        String name = "Gogo";
        name.length();
        String[] input = {"Gogo", "Pesho"};

        String.join(" ", input);
    }

}
