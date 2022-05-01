package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] action = command.split(" ");
            switch(action[0]) {
                case "Add":
                    add(numbers, Integer.parseInt(action[1]));
                    break;
                case "Remove":
                    remove(numbers, Integer.parseInt(action[1]));
                    break;
                case "RemoveAt":
                    removeAt(numbers, Integer.parseInt(action[1]));
                    break;
                case "Insert":
                    insert(numbers, Integer.parseInt(action[1]), Integer.parseInt(action[2]));
                    break;
            }

            command = scanner.nextLine();
        }

        for (int n = 0; n < numbers.size(); n++) {
            System.out.print(numbers.get(n) + " ");
        }
    }

    static void add (List<Integer> list, int number) {
    list.add(number);
    }
    static void remove (List<Integer> list, int number) {
        for (int n = 0; n < list.size(); n++) {
            if (list.get(n) == number) {
                list.remove(n);
            }
        }
    }
    static void removeAt (List<Integer> list, int index) {
        list.remove(index);
    }
    static void insert (List<Integer> list, int number, int index) {
        list.add(index, number);
    }
}
