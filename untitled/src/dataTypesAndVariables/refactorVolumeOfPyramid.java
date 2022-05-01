package dataTypesAndVariables;

import java.util.Scanner;

public class refactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, height, lol = 0;
        System.out.print("Length: ");
        base = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        height = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        lol = Double.parseDouble(scanner.nextLine());
        double area = (base * height * lol)  / 3;
        System.out.printf("Pyramid Volume: %.2f", area);
    }
}
