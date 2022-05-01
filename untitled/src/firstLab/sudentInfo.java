package firstLab;

import java.util.Scanner;

public class sudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade =Double.parseDouble(scanner.nextLine());
        System.out.printf("Name: %s, Age: %s, Grade: %.2f", name, age, grade);
    }
}
