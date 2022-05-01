package listExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<String>();
        int numbers =  Integer.parseInt(scanner.nextLine());

        for (int a = 0; a < numbers; a++) {
            String action = scanner.nextLine();
            String[] thing = action.split(" ");

            switch (thing[2]) {
                case "not":
                        if (names.contains(thing[0])) {
                            names.remove(names.indexOf(thing[0]));
                        } else {
                            System.out.printf("%s is not in the list!\n", thing[0]);
                    }
                break;
                case "going!":
                    if (names.contains(thing[0])) {
                        System.out.printf("%s is already in the list!\n", thing[0]);
                    } else {
                        names.add((thing[0]));
                    }
                    break;
            }
        }
        for (int n = 0; n < names.size(); n++) {
            System.out.println(names.get(n));
        }
    }
}
