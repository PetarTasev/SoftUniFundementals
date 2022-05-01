package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("End")) {
            String[] action = command.split(" ");
            switch (action[0]) {
                case "Add" :
                    numbers.add(Integer.parseInt(action[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(action[2]) < numbers.size() && Integer.parseInt(action[2]) >= 0) {
                        numbers.add(Integer.parseInt(action[2]), Integer.parseInt(action[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                        break;
                case "Remove":
                    if (Integer.parseInt(action[1]) < numbers.size() && Integer.parseInt(action[1]) >= 0) {
                        numbers.remove(Integer.parseInt(action[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift" :
                    switch (action[1]) {
                        case "left" :
                            for (int n = 0; n < Integer.parseInt(action[2]); n++) {
                                int firstNumber = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(firstNumber);
                            }
                            break;
                        case "right" :
                            for (int n = 0; n < Integer.parseInt(action[2]); n++) {
                                int lastNumber = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, lastNumber);
                            }
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int n = 0; n < numbers.size(); n++) {
            System.out.print(numbers.get(n) + " ");
        }
    }
}
