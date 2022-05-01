package DataTypesAndVariablesExecise;

import java.util.Scanner;

public class IntegerOpreations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int tree = Integer.parseInt(scanner.nextLine());
        int four = Integer.parseInt(scanner.nextLine());

        int result = (int) ((one + two) / tree) * four;
        System.out.println(result);
    }
}
