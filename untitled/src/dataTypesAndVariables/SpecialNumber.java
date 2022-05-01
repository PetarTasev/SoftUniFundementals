package dataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int n = 1; n <= number; n++) {
            String pass = String.valueOf(n);
            int length = pass.length();
            for (int a = 0; a < length; a++) {
                sum += Integer.parseInt(String.valueOf(pass.charAt(a)));
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%s -> True\n", n);
                sum = 0;
            } else {
                System.out.printf("%s -> False\n", n);
                sum = 0;
            }
            sum = 0;
        }
    }
}
