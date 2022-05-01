package DataTypesAndVariablesExecise;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int length = number.length();
        int sum = 0;
        for (int n = 0; n < length; n++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(n)));
        }
        System.out.println(sum);
    }
}
