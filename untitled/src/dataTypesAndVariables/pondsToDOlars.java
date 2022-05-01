package dataTypesAndVariables;

import java.util.Scanner;

public class pondsToDOlars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double convert = number * 1.36;
        System.out.printf("%.3f",convert);
    }
}
