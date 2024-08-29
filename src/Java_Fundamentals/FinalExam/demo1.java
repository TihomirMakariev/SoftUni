package Java_Fundamentals.FinalExam;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String line;

        while (!"Complete".equals(line = scanner.nextLine())) {
            String[] comm = line.split("\\s+");
            switch (comm[0]) {
                case "Make":
                    if (comm[1].equals("Upper")) {
                        input = input.toUpperCase();
                        System.out.println(input);
                    } else if (comm[1].equals("Lower")) {
                        input = input.toLowerCase();
                        System.out.println(input);
                    }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(comm[1]);
                    int index = input.length()-count;
                    System.out.println(input.substring(index));
                    break;
                case "GetUsername":
                    if (input.contains("@")) {
                        int index1 = input.indexOf("@");
                        System.out.println(input.substring(0, index1));
                    } else {
                        System.out.println("The email " + input + " doesn't contain the @ symbol.");
                    }
                    break;
                case "Replace":
                    char ch = comm[1].charAt(0);
                    input = input.replace(ch, '-');
                    System.out.println(input);
                    break;
                case "Encrypt":
                    for (int i = 0; i < input.length(); i++) {
                        System.out.print((int)input.charAt(i) + " ");
                    }
                    break;
            }
        }

    }
}
