package midExamPrep2;

import java.util.Scanner;

public class counterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        int numberOfBattles = 0;
        String distance = scanner.nextLine();

        while (!distance.equals("End of battle")) {
            int length = Integer.parseInt(distance);
            energy -= length;
            if (energy < 0) {
                System.out.printf("Not enough energy! Game ends with %s won battles and %s energy", numberOfBattles, energy + length);
                break;
            }
            numberOfBattles++;
            if (numberOfBattles % 3 == 0 && numberOfBattles >= 3) {
                energy += numberOfBattles;
            }
            distance = scanner.nextLine();
        }
        if (energy >= 0) {
            System.out.printf("Won battles: %s. Energy left: %s", numberOfBattles, energy);
        }
    }
}
