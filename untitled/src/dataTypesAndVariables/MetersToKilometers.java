package dataTypesAndVariables;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = scanner.nextInt();
        System.out.printf( "%.2f",meters / 1000.0);
    }
}
