package methods;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double price;
        switch (product) {
            case "coffee":
                price = 1.5;
                break;
            case "water":
                price = 1.0;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2.0;
                break;
            default:
                price = 0;
                break;
        }

        System.out.printf("%.2f", priceCalculation(price, amount));
    }

    static double priceCalculation (double price, int amount) {
        double x = price * amount;
        return x;
    }
}
