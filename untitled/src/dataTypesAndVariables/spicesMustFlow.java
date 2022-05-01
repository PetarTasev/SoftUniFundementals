package dataTypesAndVariables;

import java.util.Scanner;

public class spicesMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial = scanner.nextInt();
        int days = 0;
        int total = 0;

        while (initial >= 100) {
            total += initial;
            initial -= 10;
            days++;
            total -= 26;
        }
        total -= 26;
        System.out.println(days);
        if (total > 0) {
            System.out.println(total);
        } else {
            System.out.println("0");
        }
    }

}
