package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class trian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int max = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] action = command.split(" ");
            switch (action[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(action[1]));
                    break;
                default:
                    for (int n = 0; n < numbers.size(); n++) {
                        if (Integer.parseInt(action[0]) + numbers.get(n) <= max) {
                            numbers.set(n,Integer.parseInt(action[0]) + numbers.get(n));
                            break;
                        }
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
