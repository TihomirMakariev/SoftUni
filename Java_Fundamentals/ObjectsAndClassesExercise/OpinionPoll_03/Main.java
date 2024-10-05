package Java_Fundamentals.ObjectsAndClassesExercise.OpinionPoll_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Четене на броя на хората
        int n = Integer.parseInt(scanner.nextLine());

        // Списък за съхраняване на хората
        List<Person> people = new ArrayList<>();

        // Четене на информация за всеки човек
        for (int i = 1; i <= n; i++) {
            String[] personalData = scanner.nextLine().split(" ");
            String name = personalData[0];
            int age = Integer.parseInt(personalData[1]);

            // Създаване на обект Person и добавяне в списъка
            people.add(new Person(name, age));
        }

       for (Person person : people) {
           if (person.getAge() > 30) {
               System.out.println(person);
           }
       }
    }
}
