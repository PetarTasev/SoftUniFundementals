package midExamPrep1;

import java.util.Arrays;
import java.util.Scanner;

public class muOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] rooms = line.split("\\|");

        int health = 100;
        int bitcoin = 0;
        int room = 0;
        String lastMonster = "";
        while (health > 0 && room < rooms.length) {
            String[] action = rooms[room].split(" ");
            switch (action[0]) {
                case "potion":
                    health += Integer.parseInt(action[1]);
                    if (health > 100) {
                        System.out.printf("You healed for %s hp.\n", Integer.parseInt(action[1]) - (health - 100));
                        health = 100;
                    } else {
                    System.out.printf("You healed for %s hp.\n", Integer.parseInt(action[1]));
                    }
                    System.out.printf("Current health: %s hp.\n", health);
                    break;
                case "chest":
                    bitcoin += Integer.parseInt(action[1]);
                    System.out.printf("You found %s bitcoins.\n",Integer.parseInt(action[1]));
                    break;
                default:
                    health -= Integer.parseInt(action[1]);
                    if (health > 0) {
                    System.out.printf("You slayed %s.\n", action[0]);
                    } else {
                    lastMonster = action[0];
                    }
                }
            room++;
        }
        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %s\n", bitcoin);
            System.out.printf("Health: %s\n", health);
        } else {
            System.out.printf("You died! Killed by %s.\n", lastMonster);
            System.out.printf("Best room: %s\n", room);
        }
    }
}
