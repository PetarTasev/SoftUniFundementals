package midExamPrep2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shootingForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int count = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int shot = Integer.parseInt(command);
            if (shot < numbers.size() && !(numbers.get(shot) == -1)) {

                for (int n = 0; n < numbers.size(); n++) {
                    if (shot != n && (numbers.get(n) != -1)) {
                        if (numbers.get(n) > numbers.get(shot) && (numbers.get(n) != -1)) {
                            numbers.set(n, numbers.get(n) - numbers.get(shot));
                        } else if ((numbers.get(n) <= numbers.get(shot) && (numbers.get(shot) != -1))) {
                            numbers.set(n, numbers.get(n) + numbers.get(shot));
                        }
                    }
                }
                numbers.set(shot, -1);
                count++;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %s -> ",count );

        for (int n = 0; n < numbers.size(); n++) {
            System.out.print(numbers.get(n) + " ");
        }
    }
}
