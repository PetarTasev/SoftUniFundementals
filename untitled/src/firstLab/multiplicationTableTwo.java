package firstLab;

import java.util.Scanner;

public class multiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int b = scanner.nextInt();
        for (int n = b; n <= 10; n++) {
            System.out.printf("%s X %s = %s\n" , number, n, number * n);
        }
        if (b > 10) {
            System.out.printf("%s X %s = %s\n" , number, b, number * b);
        }
    }
}
