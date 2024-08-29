package Java_Fundamentals.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        //Add:{lessonTitle} - add the lesson to the end of the schedule, if it does not exist
        //Insert:{lessonTitle}:{index} -insert the lesson to the given index, if it does not exist
        //Remove:{lessonTitle} -remove the lesson, if it exists
        //Swap:{lessonTitle}:{lessonTitle} -change the place of the two lessons, if they exist
        //Exercise:{lessonTitle} -add Exercise in the schedule right after the lesson index,
        // if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise". If the lesson doesn't exist, add the lesson in the end of the course schedule, followed by the Exercise.
        while (!input.equals("course start")) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];
            switch (command) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!schedule.equals(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    if (schedule.contains(lessonTitle)) {
                        schedule.remove(lessonTitle);
                    }
                    break;

                case "Swap":
                    break;

                case "Exercise":
                    String exercise = lessonTitle + " -Exercise";
                    int indexLesson = schedule.indexOf(lessonTitle);
                     if (schedule.contains(lessonTitle)) {
                        if (indexLesson ==schedule.size()-1){
                            schedule.add(indexLesson + 1, exercise);
                        } else if (!schedule.get(indexLesson + 1).equals(exercise)) {
                            schedule.add(indexLesson + 1, exercise);
                        }
                    } else {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printList(schedule);
    }

    private static void printList(List<String> elements) {
        int count = 1;
        for (String element : elements) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
