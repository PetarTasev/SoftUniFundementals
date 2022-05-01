package mapExercices;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class legendaryGarming {
    public static void main(String[] args) {

        int shaowmourne = 0;
        int valanyr = 0;
        int dragonwrath = 0;

        Map<String, String> allMaterials = new LinkedHashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] loot = scanner.nextLine().split(" ");
            List<String> realLoot = new ArrayList<>();
            for (String element : loot) {
                realLoot.add(element.toLowerCase(Locale.ROOT));
            }

            for (int n = 1; n < realLoot.size(); n += 2) {
                if (realLoot.get(n).equals("shards")) {
                    shaowmourne += Integer.parseInt(realLoot.get(n - 1));
                } else if (realLoot.get(n).equals("fragments")) {
                    valanyr += Integer.parseInt(realLoot.get(n - 1));
                } else if (realLoot.get(n).equals("motes")) {
                    dragonwrath += Integer.parseInt(realLoot.get(n - 1));
                } else {
                    String  indexExisting = (allMaterials.get(realLoot.get(n)));
                    if (indexExisting == null) {
                        allMaterials.put(realLoot.get(n), realLoot.get(n - 1));
                    } else {
                        int numberOne = Integer.parseInt(realLoot.get(n - 1));
                        int numberTwo = Integer.parseInt(allMaterials.get(realLoot.get(n)));
                        int total = numberOne + numberTwo;
                        allMaterials.put(realLoot.get(n), String.valueOf(total));
                    }

                }
                if (shaowmourne >= 250 || valanyr >= 250 || dragonwrath >= 250) {
                    break;
                }
            }
            // good
            if (shaowmourne >= 250) {
                System.out.println("Shadowmourne obtained!");
                shaowmourne -= 250;
                break;
            }
            if (valanyr >= 250) {
                System.out.println("Valanyr obtained!");
                valanyr -= 250;
                break;
            }
            if (dragonwrath >= 250) {
                System.out.println("Dragonwrath obtained!");
                dragonwrath -= 250;
                break;
            }
            // good
        }
        System.out.println("shards: " + shaowmourne);
        System.out.println("fragments: " + valanyr);
        System.out.println("motes: " + dragonwrath);

        for (Map.Entry<String, String> entry : allMaterials.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
