package dataTypesAndVariables;

import java.util.Scanner;

public class toenINfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        float km = scanner.nextInt();

        System.out.printf("Town %s has population of %s and area %.0f square km.", town, population, km);
    }
}
