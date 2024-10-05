package Java_Fundamentals.ObjectsAndClassesExercise.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входните данни за статията
        String[] articleParts = scanner.nextLine().split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        // Създаване на обект от клас Article
        Article article = new Article(title, content, author);

        // Четене на броя команди
        int n = Integer.parseInt(scanner.nextLine());

        // Изпълнение на командите
        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(": ");
            String command = commandParts[0];
            String argument = commandParts[1];

            switch (command) {
                case "Edit":
                    article.editContent(argument);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(argument);
                    break;
                case "Rename":
                    article.renameTitle(argument);
                    break;
            }
        }
        // Отпечатване на финалния резултат
        System.out.println(article);
    }
}
