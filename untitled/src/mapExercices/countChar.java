package mapExercices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordLine = scanner.nextLine().split(" ");

        Map<Character, Integer> occurrences = new LinkedHashMap<Character, Integer>();
        for (String word : wordLine) {
            for (int n = 0; n < word.length(); n++) {
                Integer count = occurrences.get(word.charAt(n));
                if (count == null) {
                    occurrences.put(word.charAt(n), 1);
                } else {
                    occurrences.put(word.charAt(n), count + 1);
                }
            }
        }

       for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
           System.out.println(entry.getKey() + " -> " + entry.getValue());
       }
    }
}