package firstLab;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int n = 1; n <= 10; n++) {
            System.out.printf("%s X %s = %s\n" , number, n, number * n);
        }
    }
}
