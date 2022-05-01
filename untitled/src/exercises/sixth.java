package exercises;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int total = 0;
        int given = 1;
        int length = number.length();

        for (int a = 0; a <= length -1; a++){
            int digit = Integer.parseInt(String.valueOf(number.charAt(a)));
            for (int b = digit; b >= 1; b --) {
                given = given * b;
            }
            total += given;
            given = 1;

        }
        if (total == Integer.parseInt(number)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
