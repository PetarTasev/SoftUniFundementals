package exercises;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String number = scanner.nextLine();
        int a1 = Integer.parseInt(num);
        int a2 = Integer.parseInt(number);
        int total = 0;
        for (int n = a1; n <= a2; n++) {
            System.out.printf("%s ", n);
            total += n;
        }
        System.out.printf("" +
                "\nSum: %s", total);
    }

}
