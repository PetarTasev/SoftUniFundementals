package map;

import java.text.StringCharacterIterator;
import java.util.*;

public class wordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reps = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int n = 0; n < reps; n++) {
              String word = scanner.nextLine();
              String synonym = scanner.nextLine();

              List <String> synonyms = words.get(word);

              if (synonyms != null) {
                  synonyms.add(synonym);
              } else {
                  synonyms = new ArrayList<>();
                  synonyms.add(synonym);
                  words.put(word, synonyms);
            }
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.print(entry.getKey() + " - ");

            for (String synonym : entry.getValue()) {
                if (synonym.equals(entry.getValue().get(entry.getValue().size() - 1))) {
                    System.out.println(synonym);
                } else {
                System.out.print(synonym + ", ");
            }
            }
        }

    }
}
