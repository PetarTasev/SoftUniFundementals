package exercises;

import java.util.Scanner;

public class vakation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double discount = 1;
        double price = 0;
        switch (group){
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;
        }
        if (group.equals("Students") && numberOfPeople >= 30) {
            double finalPrice = (discount * numberOfPeople * price) - ((discount * numberOfPeople * price) * 0.15);
            System.out.printf("Total price: %.2f", finalPrice);
            return;
        }
        if (group.equals("Business") && numberOfPeople >= 100) {
            numberOfPeople = numberOfPeople - 10;
        }
        if (group.equals("Regular") && 10 <= numberOfPeople && numberOfPeople <= 20) {
            discount = 0.95;
        }
         double finalPrice = discount * numberOfPeople * price;

        System.out.printf("Total price: %.2f", finalPrice);
    }
}
