package methods;

import java.util.Scanner;

public class signOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("The number %s is %s.", n, signIdentifier(n));
    }

    static String signIdentifier (int x) {
        String status = "";
        if (x < 0) {
            status = "negative";
        } else {
            status = "positive";
        }
        if (x == 0) {
            status = "zero";
        }

        return status;
    }
}
