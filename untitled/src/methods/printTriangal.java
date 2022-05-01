package methods;

import java.util.Scanner;

public class printTriangal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int n = 1; n < number; n++){
             line(n);
        }
        for (int n = 1; n <= number; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n = number - 1; n >= 1; n--) {
            line(n);
        }
    }
    static void line (int x) {
        for (int n = 1; n <= x; n++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
