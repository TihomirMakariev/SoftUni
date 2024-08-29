package Java_Fundamentals.MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //•	6 – 10 characters (inclusive); - validate length
        if (!validateLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        //•	Consists only of letters and digits; - validate content
        if (!validateContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        //•	Have at least 2 digits; - validate digits;
        if (!validateDigitsCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        //валидни ли са ми всички параметри
        if (validateLength(password) && validateContent(password) && validateDigitsCount(password)){
            System.out.println("Password is valid");
        }
    }

    static boolean validateLength(String pass) {
        //валидна -> true
        //невалидна -> false
        //return pass.length() >= 6 && pass.length() <= 10; - Това е същото, но с по-добър запис
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    static boolean validateContent(String pass) {
        //букви -> кое е [65; 90] или [97; 120]
        //цифри -> кое е [48; 57]
        boolean isValid = false;
        for (int index = 0; index <= pass.length() - 1; index++) {
            char currentSymbol = pass.charAt(index);
            boolean isSmallLetter = currentSymbol >= 97 && currentSymbol <= 120;
            boolean isCapitalLetter = currentSymbol >= 65 && currentSymbol <= 190;
            boolean isDigit = currentSymbol >= 48 && currentSymbol <= 57;
            if (!isSmallLetter && !isCapitalLetter && !isDigit) {
                return false;
            }
        }
        return true;
        //ако е обходило всички символи и не е върнало false
    }

    static boolean validateDigitsCount(String pass) {
        int countDigit = 0;
        //преброим цифрите в паролата
        for (int index = 0; index <= pass.length() - 1; index++) {
            char currentSymbol = pass.charAt(index);
            if (Character.isDigit(currentSymbol)) {
                countDigit++;
            }
        }
        return countDigit >= 2;
        /*if(countDigit >=2){
            return true;
        }else {
            return false;
        }*/

    }
}
