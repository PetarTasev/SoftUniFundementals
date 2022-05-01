package arrays;

import java.util.Scanner;

public class ladyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area = Integer.parseInt(scanner.nextLine());
        int[] areaDisplay = new int[area];

        String[] position = scanner.nextLine().split(" ");
        for (int n = 0; n < position.length; n++) {
            if (Integer.parseInt(position[n]) > area - 1 || Integer.parseInt(position[n]) < 0) {
                continue;
            }
            areaDisplay[Integer.parseInt(position[n])] = 1;
        }

        String moves = scanner.nextLine();
        while (!moves.equals("end")) {
            String[] move = moves.split(" ");
            int index = Integer.parseInt(move[0]);
            String direction = move[1];
            int distance = Integer.parseInt(move[2]);

            if ("left".equals(direction)) {
                distance = -distance;
            }
            if (index <= area - 1 && index >= 0 && index + distance <= area - 1 && index + distance >= 0 ) {
                if (areaDisplay[index + distance] == 1) {
                    while (areaDisplay[index + distance] == 1) {
                        distance++;
                        if (index + distance > area - 1) {
                            break;
                        }
                    }
                }
            }
                if (index > area - 1 || index < 0) {
                    moves = scanner.nextLine();
                } else if (index + distance >= 0 || index + distance <= area - 1) {
                   areaDisplay[index] = 0;
                    areaDisplay[index + distance] = 1;
                    moves = scanner.nextLine();
                } else {
                    areaDisplay[index] = 0;
                    moves = scanner.nextLine();
                }



        }
        for (int n = 0; n < area; n++) {
            System.out.print(areaDisplay[n] + " ");
        }
    }
}
