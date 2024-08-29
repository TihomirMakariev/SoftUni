package Java_Advanced.DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        Car car1 = new Car();

        while (n-- > 0) {
            //Chevrolet Impala 390
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car;
            if (tokens.length == 1){
                car = new Car(tokens[0]);
            }else {
                car = new Car(tokens[0], tokens[1],
                        Integer.parseInt(tokens[2]));
            }

            cars.add(car);
        }

        System.out.println(cars.stream()
                .map(Car::toString)
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
