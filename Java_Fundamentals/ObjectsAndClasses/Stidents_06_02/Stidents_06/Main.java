package Java_Fundamentals.ObjectsAndClasses.Stidents_06_02.Stidents_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        // Четене на входа до "end"
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            // Проверка дали студентът вече съществува
            if (studentExists(students, firstName, lastName)) {
                // Презапиши съществуващия студент (по желание можете да добавите логика тук)
                Student existingStudent = getStudent(students, firstName, lastName);
                if (existingStudent != null) {
                    existingStudent.setAge(age);
                    existingStudent.setHomeTown(homeTown);
                }
            }else {
                Student student = new Student();
                student.setFirstName(firstName).setLastName(lastName).setAge(age).setHomeTown(homeTown);
                students.add(student);
            }

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        // Печат на студенти от даден град
        for (Student student : students) {
            if (student.getHomeTown().equals(city)) {
                System.out.printf("%s %s is %d years old.\n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }


    }

    private static boolean studentExists(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName)
                    && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }
}