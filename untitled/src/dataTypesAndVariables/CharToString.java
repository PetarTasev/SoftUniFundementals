package dataTypesAndVariables;

import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
        String tree = scanner.nextLine();

        System.out.println(one + two + tree);
    }
}
