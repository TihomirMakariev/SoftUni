package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Mike123@somemail.com
        String email = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Complete")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Make":
                    //Make {Upper} or Make {Lower}
                    if (tokens[1].equals("Upper")) {
                        email = email.toUpperCase();
                        System.out.println(email);
                    } else if (tokens[1].equals("Lower")) {
                        email = email.toLowerCase();
                        System.out.println(email);
                    }
                    break;

                case "GetDomain":
                    //"GetDomain {count}
                    int countDomain = Integer.parseInt(tokens[1]);
                    if (countDomain < email.length() && countDomain >= 0) {
                        int startIndex = email.length() - countDomain;
                        //String substring = email.substring(startIndex);
                        System.out.println(email.substring(startIndex));
                    } else {
                        System.out.println(email);
                    }
                    break;

                case "GetUsername":
                    //GetDomain 3
                    if (email.contains("@")) {
                        int index = email.indexOf("@");
                        System.out.println(email.substring(0, index));
                    } else {
                        System.out.printf("The email %s doesn't contain the @ symbol.%n", email);
                    }
                    break;

                case "Replace":
                    char character = tokens[1].charAt(0);
                    email = email.replace(character, '-');
                    System.out.println(email);
                    break;

                case "Encrypt":
                    for (int i = 0; i < email.length(); i++) {
                        System.out.print((int) email.charAt(i) + " ");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
