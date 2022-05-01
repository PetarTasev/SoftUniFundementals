package DataTypesAndVariablesExecise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int n = 0; n < number; n++) {
            int letters = Integer.parseInt(scanner.nextLine());
            sum += letters;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum -= letters;
            }
        }
        System.out.println(sum);
    }
}
