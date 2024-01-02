package MidExam;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysToPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double plunderToThisMoment = 0;

        for (int currentDay = 1; currentDay <= daysToPlunder; currentDay++) {
            //Грабене на плячка
            plunderToThisMoment += dailyPlunder;

            if (currentDay % 3 == 0) {
                plunderToThisMoment += 0.5 * dailyPlunder;
            }

            if (currentDay % 5 == 0) {
                plunderToThisMoment = 0.7 * plunderToThisMoment;
            }

        }

        if (plunderToThisMoment >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunderToThisMoment);
        } else {
            double percentOfExpectedPlunder = (plunderToThisMoment / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentOfExpectedPlunder);
        }

    }
}
