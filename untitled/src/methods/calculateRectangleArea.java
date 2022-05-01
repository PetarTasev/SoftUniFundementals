package methods;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        int x = (int) areaCalculator(base, height);
        System.out.println(x);

    }

    static double areaCalculator (double base, double height) {
        int area = (int) (base * height);
        return area;
    }
}
