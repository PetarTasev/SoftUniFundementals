package methodsExercises;

import java.util.Scanner;

public class mirrorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        while (!number.equals("END")) {
            int numberInt = Integer.parseInt(number);
             if (numberInt == (reversed(number))) {
                 System.out.println(true);
            } else {
                 System.out.println(false);
             }

            number = scanner.nextLine();
        }

    }
    static int reversed (String number) {
        int reversed = 0;
        int num = Integer.parseInt(number);
        while (num != 0) {
            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }
        return reversed;
    }
}
