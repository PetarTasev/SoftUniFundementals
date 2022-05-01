package arraysExercises;

import java.util.Scanner;

public class laddyBugLatterButImDumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        Integer[] board = new Integer[size];

        String[] initial = scanner.nextLine().split(" ");

        for (int n = 0; n < initial.length; n++) {
            if (Integer.parseInt(initial[n]) < size && Integer.parseInt(initial[n])  >= 0) {
                board[Integer.parseInt(initial[n])] = 1;
            }
        }
        String action = scanner.nextLine();
        while(!action.equals("end")) {
            String[] movement = action.split(" ");
            if (board[Integer.parseInt(movement[0])] == 1 && board[Integer.parseInt(movement[0])] != null) {
            switch (movement[1]) {
                case "right":
                    if (Integer.parseInt(movement[0]) + Integer.parseInt(movement[2]) < size && Integer.parseInt(movement[0]) + Integer.parseInt(movement[2]) >= 0) {
                        board[Integer.parseInt(movement[0])] = 0;
                        board[Integer.parseInt(movement[0]) + Integer.parseInt(movement[2])] = 1;
                    } else {
                        board[Integer.parseInt(movement[0])] = 0;
                    }
                    break;
                case "left":
                    if (Integer.parseInt(movement[0]) - Integer.parseInt(movement[2]) < size && Integer.parseInt(movement[0]) - Integer.parseInt(movement[2]) >= 0) {
                        board[Integer.parseInt(movement[0])] = 0;
                        board[Integer.parseInt(movement[0]) - Integer.parseInt(movement[2])] = 1;
                    } else {
                        board[Integer.parseInt(movement[0])] = 0;
                    }
                    break;
            }
        }
            action = scanner.nextLine();
        }

        for (int n = 0; n < board.length; n++) {
            System.out.println(board[n] + " ");
        }
    }
}
