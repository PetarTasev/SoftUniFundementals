package textStuff;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> attackerNames = new TreeMap<>();
        Map<String, Integer> defendersNames = new TreeMap<>();

        int repetitions = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < repetitions; n++) {

            String regex = "[STARstar]";
            String line = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            int difference = 0;
            boolean letter = matcher.find();
            while(letter) {
                difference++;
                letter = matcher.find();
            }

            String codeToDecode = "";
            for (int a = 0; a < line.length(); a++) {
                int charr = line.charAt(a) - difference;
                char correctLetter = (char) charr;
                codeToDecode += correctLetter;
            }

            regex = "@(?<name>[A-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>\\d+)";


            Pattern pattern1 = Pattern.compile(regex);
            Matcher matcher1 = pattern1.matcher(codeToDecode);

            if (matcher1.find()) {
                if (matcher1.group("attackType").equals("A")) {
                    attackerNames.put(matcher1.group("name"), 12);
                } else if (matcher1.group("attackType").equals("D")) {
                    defendersNames.put(matcher1.group("name"), 12);
                }
            }
        }

        System.out.println("Attacked planets: " + attackerNames.size());
        for (Map.Entry<String, Integer> entry : attackerNames.entrySet()) {
            System.out.println("-> " + entry.getKey());
        }
        System.out.println("Destroyed planets: " + defendersNames.size());
        for (Map.Entry<String, Integer> entry : defendersNames.entrySet()) {
            System.out.println("-> " + entry.getKey());
        }
    }
}
