package methodsExercises;

import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int n = 0; n < number; n++) {
            LinePrinter(number);
        }
    }
    static void LinePrinter (int n) {
        for (int b = 0; b < n; b++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
