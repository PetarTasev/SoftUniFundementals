package midExamForReal;

import java.util.Scanner;

public class spaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
         String[] moves = line.split("\\|\\|");
         int fuel = Integer.parseInt(scanner.nextLine());
         int amo = Integer.parseInt(scanner.nextLine());

         for (int n = 0; n < moves.length; n++) {
             String[] action = moves[n].split(" ");
             switch (action[0]) {
                 case "Travel":
                     fuel -= Integer.parseInt(action[1]);
                     if (fuel >= 0) {
                         System.out.printf("The spaceship travelled %s light-years.\n", Integer.parseInt(action[1]));
                     } else {
                         System.out.println("Mission failed.");
                         return;
                     }
                     break;
                 case "Enemy":
                     amo -= Integer.parseInt(action[1]);
                     if (amo >= 0) {
                         System.out.printf("An enemy with %s armour is defeated.\n", Integer.parseInt(action[1]));
                     } else {
                         amo += Integer.parseInt(action[1]);
                         fuel -= Integer.parseInt(action[1]) * 2;
                         if (fuel >= 0) {
                             System.out.printf("An enemy with %s armour is outmaneuvered.\n", Integer.parseInt(action[1]));
                         } else {
                             System.out.println("Mission failed.");
                             return;
                         }
                     }
                     break;
                 case "Repair":
                     fuel += Integer.parseInt(action[1]);
                     amo += 2 * Integer.parseInt(action[1]);
                     System.out.printf("Ammunitions added: %s.\n", Integer.parseInt(action[1]) * 2);
                     System.out.printf("Fuel added: %s.\n", Integer.parseInt(action[1]));
                     break;
                 case "Titan":
                     System.out.println("You have reached Titan, all passengers are safe.");
                     break;
             }
         }
    }
}
