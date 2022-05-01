package methodsExercises;

import java.util.Scanner;

public class factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        if (first <= 0 || second <= 0) {
            System.out.println("0");
        } else {
            int firstFactorial = factorial(first);
            int secondFactorial = factorial(second);

            double result = firstFactorial / (secondFactorial * 1.0);

            System.out.printf("%.2f", result);
        }
    }
    static int factorial (int number) {
        int sum = 1;
        for (int n = 1; n <= number; n++) {
            sum = sum * n;
        }
        return sum;
    }

}
