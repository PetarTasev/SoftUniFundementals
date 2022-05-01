package firstLab;

import java.util.Scanner;

public class someAddingAndThat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int odd = 1;
        for (int n = number; n >= 1; n--) {
            System.out.println(odd);
            sum += odd;
            odd += 2;
        }
        System.out.printf("Sum: %s", sum);
    }
}
