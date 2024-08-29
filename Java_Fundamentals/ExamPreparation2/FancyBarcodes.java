package Java_Fundamentals.ExamPreparation2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String productRegex = "@#+(?<Product>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(productRegex);

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                String product = matcher.group("Product");
                String productGroup = "";
                for (int j = 0; j <= product.length() - 1; j++) {
                    char currentSymbol = product.charAt(j);
                    if (Character.isDigit(currentSymbol)) {
                        productGroup += currentSymbol;
                    }
                }
                if (productGroup.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + productGroup);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
