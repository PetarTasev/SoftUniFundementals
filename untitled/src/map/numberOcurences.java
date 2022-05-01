package map;

import java.util.*;

public class numberOcurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        Map<String, Integer> numberOccurrence = new LinkedHashMap<>();


        for (String number: numbers) {
            String newNumber = number.toLowerCase(Locale.ROOT);
            Integer currentRepetitions = numberOccurrence.get(newNumber);
            if (numberOccurrence.get(newNumber) != null) {
                numberOccurrence.put(newNumber, currentRepetitions + 1);
            } else {
                numberOccurrence.put(newNumber, 1);
            }
        }
        List<String> finall = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : numberOccurrence.entrySet()) {
            if (entry.getValue() %  2 == 1 || entry.getValue() == 1) {
                finall.add(entry.getKey());
            }
        }

        for (int n = 0; n < finall.size(); n++) {
            if (n == finall.size() - 1) {
                System.out.println(finall.get(n));
            } else {
                System.out.print(finall.get(n) + ", ");
            }
        }
    }
}
