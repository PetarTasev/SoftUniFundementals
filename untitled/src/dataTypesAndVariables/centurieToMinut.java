package dataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class centurieToMinut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double years = number * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;


        System.out.printf("%s centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", number, years, days, hours, minutes);
    }
}
