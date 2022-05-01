package methodsExercises;

import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());

        for (int n = 1; n <= range; n++) {
            String number = String.valueOf(n);
        if (isItDivisibleBe8(number) && doseItContainAOddNumber(number)) {
            System.out.println(n);
        }

    }



    }
    static Boolean isItDivisibleBe8 (String number) {
        int sum = 0;
        for (int n = 0; n < number.length(); n++) {
            sum  += Integer.parseInt(String.valueOf(number.charAt(n)));
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
    static Boolean doseItContainAOddNumber (String number) {
        for (int n = 0; n < number.length(); n++) {
            if (Integer.parseInt(String.valueOf(number.charAt(n))) % 2 == 1 ) {
                return true;
            }
        }
        return false;
    }
}
