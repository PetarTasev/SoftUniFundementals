package midExamPrep;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class arrayMidifuer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")) {
            String[] action = command.split(" ");
            switch (action[0]) {
                case "swap":
                    int remember = numbers.get(Integer.parseInt(action[1]));
                    numbers.set(Integer.parseInt(action[1]), numbers.get(Integer.parseInt(action[2])));
                    numbers.set(Integer.parseInt(action[2]), remember);
                    break;
                case "multiply":
                    numbers.set(Integer.parseInt(action[1]), numbers.get(Integer.parseInt(action[1])) * numbers.get(Integer.parseInt(action[2])));
                    break;
                case "decrease":
                    for (int n = 0; n < numbers.size(); n++) {
                        numbers.set(n, numbers.get(n) - 1);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int n = 0; n < numbers.size(); n++) {
            if (n == numbers.size() - 1) {
                System.out.print(numbers.get(n));
            } else {
                System.out.print(numbers.get(n) + ", ");
            }
        }
    }
}
