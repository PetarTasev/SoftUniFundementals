package classesAndObjects;

import java.math.BigInteger;
import java.util.Scanner;

public class bogNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
        BigInteger total = (first.add(second));
        System.out.println(total);
    }
}
