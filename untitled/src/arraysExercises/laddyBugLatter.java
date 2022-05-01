package arraysExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class laddyBugLatter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> board = new ArrayList<Integer>(100);
        int size = Integer.parseInt(scanner.nextLine());

        String[] first = scanner.nextLine().split(" ");


        for (int n = 0; n < size; n++) {
            boolean contains = false;
            for (String bug : first) {
                if (Integer.parseInt(bug) == n) {
                    contains = true;
                }
            }
            if (contains) {
                board.add(n, 1);
            } else {
                board.add(n, 0);
            }
        }

        String movement = scanner.nextLine();
        while(!movement.equals("end")) {
            String[] actions = movement.split(" ");
            switch (actions[1]) {
                case "right":
                    if (board.get(Integer.parseInt(actions[0])) == 1){
                        int newLoc = Integer.parseInt(actions[0]) + Integer.parseInt(actions[2]);
                        if (newLoc > size) {
                            break;
                        }
                        board.remove(Integer.parseInt(actions[0]));
                        board.add(Integer.parseInt(actions[0]), 0);

                        if (!(newLoc >= size && newLoc < 0)) {
                            board.remove(newLoc);
                        }
                        board.add(newLoc, 1);
                    }
                    break;
                case "left":
                    if (board.get(Integer.parseInt(actions[0])) == 1){
                        int newLoc = Integer.parseInt(actions[0]) - Integer.parseInt(actions[2]);
                        if (newLoc > size) {
                            break;
                        }
                        board.remove(Integer.parseInt(actions[0]));
                        board.add(Integer.parseInt(actions[0]), 0);

                        if (board.get(newLoc) != -1) {
                            board.remove(newLoc);
                        }
                            board.add(newLoc, 1);
                    }
                    break;
            }
            movement = scanner.nextLine();
        }

        for (int n = 0; n < size; n++) {
            System.out.print(board.get(n) + " ");
        }
    }
}
