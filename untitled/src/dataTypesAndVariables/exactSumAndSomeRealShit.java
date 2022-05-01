package dataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class exactSumAndSomeRealShit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  g = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int n = 1; n <= g; n++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
             sum = sum.add(number);
        }
        System.out.print(sum);
    }
}
