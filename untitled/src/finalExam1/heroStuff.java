package finalExam1;

import java.util.*;

public class heroStuff {
    public static void main(String[] args) {
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < count; n++) {
            String[] stats = scanner.nextLine().split(" ");
            List<Integer> add = new ArrayList<>();
            add.add(Integer.parseInt(stats[1]));
            add.add(Integer.parseInt(stats[2]));
            heroes.put(stats[0], add);
        }

        String manipulation = scanner.nextLine();
        while (!manipulation.equals("End")) {
            String[] action = manipulation.split(" - ");
            switch (action[0]) {
                case "CastSpell" :
                    String heroName = action[1];
                    int manaNeeded = Integer.parseInt(action[2]);
                    String spellName = action[3];

                    int curentMana = heroes.get(heroName).get(1);
                    int totalMana = curentMana - manaNeeded;
                    if (totalMana >= 0) {
                        System.out.println(heroName +" has successfully cast " + spellName + " and now has " + totalMana + " MP!");
                        heroes.get(heroName).remove(1);
                        heroes.get(heroName).add(1,totalMana);
                    } else {
                        System.out.println(heroName + " does not have enough MP to cast " + spellName + "!");
                    }
                    break;
                case "TakeDamage" :
                    heroName = action[1];
                    int damage = Integer.parseInt(action[2]);
                    String attacker = action[3];

                    int curentHealth = heroes.get(heroName).get(0);
                    int totalHealth = heroes.get(heroName).get(0)  - damage;
                    if (totalHealth > 0) {
                        System.out.println(heroName + " was hit for " + damage + " HP by " + attacker + " and now has " + totalHealth + " HP left!");
                        heroes.get(heroName).remove(0);
                        heroes.get(heroName).add(0,totalHealth);
                    } else {
                        System.out.println(heroName + " has been killed by " + attacker + "!");
                        heroes.remove(heroName);
                    }
                    break;
                case "Recharge" :
                    heroName = action[1];
                    int amount = Integer.parseInt(action[2]);

                    int heroHealth = heroes.get(heroName).get(1);
                    int newHealth = Math.min(heroes.get(heroName).get(1) + amount, 200);
                    System.out.println(heroName + " recharged for " + (newHealth - heroes.get(heroName).get(1)) +" MP!");
                    heroes.get(heroName).remove(1);
                    heroes.get(heroName).add(1,newHealth);
                    break;
                case "Heal" :
                    heroName = action[1];
                    int healAmount = Integer.parseInt(action[2]);

                    heroHealth = heroes.get(heroName).get(0);
                    newHealth = Math.min(heroes.get(heroName).get(0) + healAmount, 100);
                    System.out.println(heroName + " healed for " + (newHealth - heroes.get(heroName).get(0)) +" HP!");
                    heroes.get(heroName).remove(0);
                    heroes.get(heroName).add(0, newHealth);
                    break;
            }
            manipulation = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroes.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue().get(0));
            System.out.println("  MP: " + entry.getValue().get(1));
        }

    }
}
