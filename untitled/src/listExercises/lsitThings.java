package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lsitThings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String action = scanner.nextLine();
        while(!action.equals("End")) {
            String[] manipulation = action.split(" ");
             switch (manipulation[0]) {
                 case "Add" :
                     numbers.add(Integer.parseInt(manipulation[1]));
                     break;
                 case "Insert" :
                     if (Integer.parseInt(manipulation[1]) >= numbers.size() - 1 && Integer.parseInt(manipulation[1]) < 0) {
                         System.out.println("Invalid index");
                         break;
                     }
                     numbers.add(Integer.parseInt(manipulation[1]), Integer.parseInt(manipulation[2]));
                     break;
                 case "Remove" :
                     Integer num = Integer.parseInt(manipulation[1]);
                     numbers.remove(Integer.parseInt(manipulation[1]));
                     break;
                 case "Shift":
                     switch (manipulation[1]) {
                         case "left" :
                             int first = numbers.get(0);
                             numbers.remove(0);
                             numbers.add(first);
                             break;
                         case "right" :
                             int firstt = numbers.get(numbers.size() - 1);
                             numbers.remove(numbers.size() - 1);
                             numbers.add(firstt);
                             break;
                     }
                     break;
             }
            action = scanner.nextLine();
        }

        for (Integer number : numbers) {
            if (number.equals(numbers.get(0))) {
                System.out.print(number);
            } else {
                System.out.print(" " + number);
            }
        }
    }
}
