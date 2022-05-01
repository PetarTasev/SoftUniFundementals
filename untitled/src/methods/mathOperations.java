package methods;

import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        String action = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());
        int finall = 0;
        switch (action) {
            case "+":
                finall = (int) addition(first, second);
                break;
            case "*":
                finall = (int) multiplication(first, second);
                break;
            case "-":
                finall = (int) subtraction(first, second);
                break;
            case "/":
                finall = (int) dividing(first, second);
                break;
        }

        System.out.println(finall);
    }

    static int addition (int one, int two) {
        int result = one + two;
        return result;
    }
    static int multiplication (int one, int two) {
        int result = one * two;
        return result;
    }
    static int subtraction (int one, int two) {
        int result = one - two;
        return result;
    }
    static double dividing (int one, int two) {
        double result =  one * 1.0 / two;
        return result;
    }
}
