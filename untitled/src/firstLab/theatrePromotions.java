package firstLab;

import java.util.Scanner;

public class theatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = scanner.nextInt();
        if (age < 0) {
            System.out.println("Error!");
            return;
        }
        switch (day) {
            case "Weekday":
                if( 0 <= age && age <= 18) {
                    System.out.println("12$");
                } else if (age <= 64) {
                    System.out.println("18$");
                } else if (age <= 122) {
                    System.out.println("12$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if( 0 <= age && age <= 18) {
                    System.out.println("15$");
                } else if (age <= 64) {
                    System.out.println("20$");
                } else if (age <= 122) {
                    System.out.println("15$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if( 0 <= age && age <= 18) {
                    System.out.println("5$");
                } else if (age <= 64) {
                    System.out.println("12$");
                } else if (age <= 122) {
                    System.out.println("10$");
                } else {
                    System.out.println("Error!");
                }
                break;
        }
    }
}
