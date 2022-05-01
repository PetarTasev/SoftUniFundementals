package methods;

import java.util.Scanner;

public class oddAndEvenBattleMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if (number.charAt(0) == '-') {
            numberSeparator1(number);

            int one = numberSeparator1(number) [0];
            int two = numberSeparator1(number) [1];
            System.out.println(one * two);
        } else {
            numberSeparator(number);

            int one = numberSeparator(number) [0];
            int two = numberSeparator(number) [1];
            System.out.println(one * two);
        }

    }

    static int[] numberSeparator(String number) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int n = 0; n < number.length(); n++) {
            if (Integer.parseInt(String.valueOf((number.charAt(n)))) % 2 == 0) {
                sumEven += Integer.parseInt(String.valueOf((number.charAt(n))));
            } else {
                sumOdd += Integer.parseInt(String.valueOf((number.charAt(n))));
            }
        }
        int[]  results = new int [] {sumEven, sumOdd};
        return results;
    }

    static int[] numberSeparator1(String number) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int n = 1; n < number.length(); n++) {
            if (Integer.parseInt(String.valueOf((number.charAt(n)))) % 2 == 0) {
                sumEven += Integer.parseInt(String.valueOf((number.charAt(n))));
            } else {
                sumOdd += Integer.parseInt(String.valueOf((number.charAt(n))));
            }
        }
        int[]  results = new int [] {sumEven, sumOdd};
        return results;
    }
}
