package midExamPrep2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String commands = scanner.nextLine();
        while(!commands.equals("End")) {
            String[] action = commands.split(" ");
            switch (action[0]) {
                case "Shoot":
                    if (Integer.parseInt(action[1]) >= 0 && Integer.parseInt(action[1]) < numbers.size()) {
                        int reminder = numbers.get(Integer.parseInt(action[1])) - Integer.parseInt(action[2]);
                        if (reminder > 0) {
                            numbers.set(Integer.parseInt(action[1]), reminder);
                        } else {
                            numbers.remove(Integer.parseInt(action[1]));
                        }
                    }
                    break;

                    //  its here boys
                case "Add":
                    if (Integer.parseInt(action[1]) >= 0 && Integer.parseInt(action[1]) < numbers.size()) {
                        int total = Integer.parseInt(action[2]);
                        numbers.add(Integer.parseInt(action[1]), total);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                    // its here
                case "Strike":
                    int index = Integer.parseInt(action[1]);
                    int y = Integer.parseInt(action[2]);
                    if (index + y < numbers.size() && index - y >= 0) {
                        for (int n = index + y; n >= index - y; n--) {
                            numbers.remove(n);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            commands = scanner.nextLine();
        }

        for (int n = 0; n < numbers.size(); n++) {
            if (n == numbers.size() - 1) {
                System.out.print(numbers.get(n));
            } else {
                System.out.print(numbers.get(n) + "|");
            }
        }
    }
}
