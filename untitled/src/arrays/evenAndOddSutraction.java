package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSutraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();
        String [] individual =(lineOfNumbers.split(" "));
        int sumOdd = 0;
        int sumEven = 0;
        for (int n = 0; n < individual.length; n++) {
            int number = Integer.parseInt(individual[n]);
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
