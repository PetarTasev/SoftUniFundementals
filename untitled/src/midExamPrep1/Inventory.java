package midExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] action = command.split(" - ");
            switch (action[0]) {
                case "Collect":
                    if (!inventory.contains(action[1])) {
                        inventory.add(action[1]);
                    }
                    break;

                ///// works for sure
                case "Drop":
                    if (inventory.indexOf(action[1]) != -1) {
                        inventory.remove(inventory.indexOf(action[1]));
                    }
                    break;
                //// works for sure
                //// works for sure
                case "Combine Items":
                    String[] combiantio = action[1].split(":");
                    if (inventory.indexOf(combiantio[0]) != -1) {
                        inventory.add(inventory.indexOf(combiantio[0]) + 1, combiantio[1]);
                    }
                    break;
                //// works for sure
                //// works for sure
                case "Renew":
                    if (inventory.indexOf(action[1]) != -1) {
                        inventory.remove(inventory.indexOf(action[1]));
                        inventory.add(action[1]);
                    }
                    break;
                //// works for sure
            }
            command = scanner.nextLine();
        }
        for (int n = 0; n < inventory.size(); n++) {
            if (n == inventory.size() - 1)  {
                System.out.print(inventory.get(n));
            } else {
                System.out.print(inventory.get(n) + ", ");
            }

        }
    }
}
