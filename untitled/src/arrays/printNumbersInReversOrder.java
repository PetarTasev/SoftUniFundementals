package arrays;

import java.util.Scanner;

public class printNumbersInReversOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        int [] numberLine = new int [numberCount];
        for (int n = 0; n < numberCount; n++) {
            numberLine [n] = Integer.parseInt(scanner.nextLine());
        }
        for (int n = numberCount - 1; n >= 0; n--) {
            System.out.print(numberLine[n]);
            System.out.print(" ");
        }
    }
}
