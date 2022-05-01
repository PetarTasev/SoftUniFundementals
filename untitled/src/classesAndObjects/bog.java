package classesAndObjects;

import java.math.BigInteger;
import java.util.Scanner;

public class bog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reps = Integer.parseInt(scanner.nextLine());
        BigInteger sum = new BigInteger("1");

        for (int n = 1; n <= reps; n++) {
            BigInteger number = new BigInteger(String.valueOf(n));
            sum = sum.multiply(number);
        }
        System.out.println(sum);
    }
}