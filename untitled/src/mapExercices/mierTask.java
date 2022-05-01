package mapExercices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class mierTask {
    public static void main(String[] args) {

        Map<String, Integer> list = new LinkedHashMap<String, Integer>();

        Scanner scanner = new Scanner(System.in);
        String material = scanner.nextLine();
        while (!material.equals("stop")) {
            int amount = Integer.parseInt(scanner.nextLine());
            Integer currentAmount = list.get(material);
            if (currentAmount != null) {
                list.put(material, currentAmount + amount);
            } else {
                list.put(material, amount);
            }
            material = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
