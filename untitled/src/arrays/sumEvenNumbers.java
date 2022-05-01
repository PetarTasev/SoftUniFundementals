package arrays;

import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();
        String [] individual = lineOfNumbers.split(" ");
        int length = individual.length;
        int sum = 0;
        for (int n = 0; n < length ; n++) {
            int number = Integer.parseInt(individual[n]);
            if (number % 2 == 0) {
                sum += Integer.parseInt(individual[n]);
            }
        }
        System.out.println(sum);
    }
}
