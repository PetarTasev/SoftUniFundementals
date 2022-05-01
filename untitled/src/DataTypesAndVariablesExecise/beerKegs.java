package DataTypesAndVariablesExecise;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double max = 0;
        String maxName = "";
        for (int n = 1; n <= number; n++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume > max) {
                max = volume;
                maxName = name;
            }
        }
        System.out.println(maxName);
    }
}
