package mapExercices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingLot = new LinkedHashMap<String,String>();
        int reps = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < reps; n++) {
            String[] action = scanner.nextLine().split(" ");
            switch (action[0]) {
                case "register":
                    if (parkingLot.containsKey(action[1])) {
                        System.out.println("ERROR: already registered with plate number " + action[2]);//
                    } else {
                        parkingLot.put(action[1], action[2]);
                        System.out.println(action[1] + " registered " + action[2] + " successfully"); //
                    }
                    break;
                case "unregister":
                    if (parkingLot.containsKey(action[1])) {
                        parkingLot.remove(action[1]);
                        System.out.println(action[1] + " unregistered successfully");//
                    } else {
                        System.out.println("ERROR: user " + action[1] + " not found");//
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> entry : parkingLot.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
