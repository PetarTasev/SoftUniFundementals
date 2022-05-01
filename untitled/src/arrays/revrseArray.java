package arrays;

import java.util.Scanner;

public class revrseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfInfo = scanner.nextLine();
        String [] individualDigit = lineOfInfo.split("\\s+");

        for (int n = 0; n < ( individualDigit.length / 2 ); n++) {
            String currentNumber = individualDigit[(n)];
            int lestPosition = individualDigit.length - 1 - n;
            individualDigit[n] = individualDigit[lestPosition];
            individualDigit[lestPosition] = currentNumber;
        }
        for (int n = 0; n < individualDigit.length; n++) {
            System.out.print(individualDigit[n]);
            System.out.print(" ");
        }
    }
}
