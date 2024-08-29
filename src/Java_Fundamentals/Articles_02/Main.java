package Java_Fundamentals.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //Title,Content,Author -> ["Title","Content","Author"]
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Article article = new Article(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            //"Edit: {new content}" -> : -> ["Edit", "fsadfsd"]
            // "ChangeAuthor: {new author}"
            // "Rename: {new title}"
            String typeCommand = command.split(": ")[0];
            String newData = command.split(": ")[1];

            switch (typeCommand) {
                case "Edit":
                    article.edit(newData);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(newData);
                    break;
                case "Rename":
                    article.rename(newData);
                    break;
            }
        }
        System.out.println(article);
    }
}
