package exercises;

import java.util.Scanner;

public class order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        double expense = 0.0;

        for (int n = 1; n <= count; n++) {
            double PPC = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int CC = Integer.parseInt(scanner.nextLine());
            double total = PPC * days * CC;
            System.out.printf("The price for the coffee is: $%.2f\n", total);
            expense += total;
        }
        System.out.printf("Total: $%.2f", expense);
    }
}
