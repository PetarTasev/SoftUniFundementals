package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deckOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deckTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (deckOne.size() > 0 && deckTwo.size() > 0) {
            if (deckOne.get(0) > deckTwo.get(0)) {
                int first = deckOne.get(0);
                int second = deckTwo.get(0);

                deckOne.remove(0);
                deckTwo.remove(0);
                deckOne.add(first);
                deckOne.add(second);
            } else if (deckTwo.get(0) > deckOne.get(0)) {
                int first = deckTwo.get(0);
                int second = deckOne.get(0);

                deckOne.remove(0);
                deckTwo.remove(0);
                deckTwo.add(first);
                deckTwo.add(second);
            } else {
                deckOne.remove(0);
                deckTwo.remove(0);
            }
        }
        int total = 0;
        if (deckOne.size() == 0) {
            for (int number : deckTwo) {
                total += number;
            }
            System.out.print("Second player wins! ");
        } else {
            for (int number : deckOne) {
                total += number;
            }
            System.out.print("First player wins! ");
        }
        System.out.printf("Sum: %s", total);
    }
}
