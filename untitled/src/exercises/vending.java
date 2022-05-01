package exercises;

import java.util.Scanner;

public class vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = 0.0;
        boolean collection = true;
        boolean spending = true;
        System.out.println("Insert coin: 0.1, 0.2, 0.5, 1 or 2. When done press Start");
        while (collection) {
            String numberIn = scanner.nextLine();
            if (numberIn.equals("Start")) {
                break;
            } else if (!(numberIn.equals("0.1") || numberIn.equals("0.2") ||numberIn.equals("0.5") || (numberIn.equals("0.10") || numberIn.equals("0.20") || numberIn.equals("0.50")|| numberIn.equals("1") ||numberIn.equals("2")))) {
                double coin = Double.parseDouble(numberIn);
                System.out.printf("Cannot accept %.2f\n",coin);
            } else {
                double coin = Double.parseDouble(numberIn);
                change += coin;
            }
        }
        System.out.println("Order: Soda Water Nuts Crisps and Coke. When done press End");
        while (spending) {
            String item = scanner.nextLine();
            if (item.equals("End")) {
                break;
            }
            switch (item) {
                case ("Nuts"):
                    change -= 2.00;
                    if (change >= 0.0) {
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                        change += 2.00;
                    }
                break;
                case ("Water"):
                    change -= 0.70;
                    if (change >= 0.0) {
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                        change += 0.70;
                    }
                    break;
                case ("Crisps"):
                    change -= 1.50;
                    if (change >= 0.0) {
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                        change += 1.50;
                    }
                    break;
                case ("Soda"):
                    change -= 0.80;
                    if (change >= 0.0) {
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                        change += 0.80;
                    }
                    break;
                case ("Coke"):
                    change -= 1.00;
                    if (change >= 0.0) {
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                        change += 1.00;
                    }
                    break;
                default :
                    System.out.println("Invalid product");
            }

        }
        System.out.printf("Change: %.2f", change);
    }
}
