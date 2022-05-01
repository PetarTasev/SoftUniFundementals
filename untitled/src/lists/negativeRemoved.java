package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class negativeRemoved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) < 0) {
                numbers.remove(n);
                n = -1;
            }
        }
        if (numbers.size() > 0) {
            for (int n = numbers.size() - 1; n >= 0; n--) {
                System.out.print(numbers.get(n));
                System.out.print(" ");
            }
        } else {
            System.out.println("empty");
        }
    }
}
