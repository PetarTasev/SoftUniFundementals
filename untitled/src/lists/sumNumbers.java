package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int n = 0; n < numbers.size() - 1; n++) {
            if (numbers.get(n).equals(numbers.get(n + 1))) {
                numbers.set(n, numbers.get(n) + numbers.get(n));
                numbers.remove(n + 1);
                n = -1;
            }
        }
        for (int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) % 1 == 0) {
                System.out.printf("%.0f" + " ", numbers.get(n));
            } else {
                System.out.print(numbers.get(n) + " ");
            }
        }
    }
}
