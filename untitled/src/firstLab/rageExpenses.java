package firstLab;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());
        int count = 0;
        double totalPrice = 0.0;
        for (int n = 1; n <= gamesLost; n++) {
            if (n % 2 == 0) {
                totalPrice += headset;
            }
            if (n % 3 == 0) {
                totalPrice += mouse;
            }
            if (n % 3 == 0 && n % 2 == 0) {
                totalPrice += keyboard;
                count++;
                if (count % 2 == 0 && count > 0) {
                    totalPrice += display;
                    count = 0;
            }

            }
        }
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
