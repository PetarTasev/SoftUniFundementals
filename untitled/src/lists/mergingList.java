package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingList {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> numbersOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    List<Integer> numbersTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

    int shortest  = 0;
    if (numbersOne.size() > numbersTwo.size()) {
        shortest  = numbersTwo.size();
    } else {
        shortest  =numbersOne.size();
    }

    for (int n = 0; n < shortest; n++) {
        System.out.print(numbersOne.get(n));
        System.out.print(" ");
        System.out.print(numbersTwo.get(n));
        System.out.print(" ");
    }
    int count = 0;
    if (shortest  == numbersTwo.size()) {
        for (int n = shortest;n < numbersOne.size(); n++) {
            System.out.print(numbersOne.get(n));
            System.out.print(" ");
        }
    } else {
        for (int n = shortest;n < numbersTwo.size(); n++) {
            System.out.print(numbersTwo.get(n));
            System.out.print(" ");
        }
    }

}
}
