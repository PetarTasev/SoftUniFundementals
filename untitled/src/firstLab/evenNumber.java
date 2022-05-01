package firstLab;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                if (number < 0) {
                    System.out.printf("The number is: %s", number * -1);
                    break;
                } else {
                    System.out.printf("The number is: %s", number);
                    break;
                }
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
