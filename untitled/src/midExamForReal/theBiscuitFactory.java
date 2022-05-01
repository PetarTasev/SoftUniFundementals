package midExamForReal;

import java.util.Scanner;

public class theBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());
        int monthlyBiscuitsFromRival = Integer.parseInt(scanner.nextLine());

        int dailyProduction = biscuitsPerDayPerWorker * numberOfWorkers;
        int thirdDayProduction = (int) Math.floor(dailyProduction * 0.75);
        int total = 0;
        for (int n = 1; n <= 30; n++) {
            if (n % 3 == 0 && n >= 3) {
                total += thirdDayProduction;
            } else {
                total += dailyProduction;
            }
        }
        System.out.printf("You have produced %s biscuits for the past month.\n", total);

        if(total > monthlyBiscuitsFromRival) {
            int left = total - monthlyBiscuitsFromRival;
            double percent = left * 1.0 / monthlyBiscuitsFromRival * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percent);
        } else {
            double percent = 100 - ((total / (monthlyBiscuitsFromRival * 1.0)) * 100);
            System.out.printf("You produce %.2f percent less biscuits.", percent );
        }
    }
}
