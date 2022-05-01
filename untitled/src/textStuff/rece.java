package textStuff;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class rece {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexCount = "[0-9]";
        String regexName = "[A-Za-z]";

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String, Integer> finisher = new TreeMap<String, Integer>();

        String entry = scanner.nextLine();
        while (!entry.equals("end of race")) {
            String name = "";
            int amount = 0;
            Pattern pattern = Pattern.compile(regexCount);
            Matcher matcher = pattern.matcher(entry);
            boolean position = matcher.find();
            while(position) {
                amount += Integer.parseInt(matcher.group());
                position = matcher.find();
            }
            Pattern patternn = Pattern.compile(regexName);
            Matcher matcherr = patternn.matcher(entry);

            boolean charecter = matcherr.find();
            while(charecter) {
                name = name + matcherr.group();

                charecter = matcherr.find();
            }

            if(list.contains(name)) {
                if (finisher.containsKey(name)) {
                    finisher.put(name, amount + finisher.get(name));
                } else {
                    finisher.put(name, amount);
                }

            }

            entry = scanner.nextLine();
        }
       Map<Integer, String> winners = new TreeMap();
        int count = 0;
        for (Map.Entry<String, Integer> winer : finisher.entrySet()) {
                winners.put(winer.getValue(), winer.getKey());
        }
        List <String> winnerNames = new ArrayList<>();
        for (Map.Entry<Integer, String> entries : winners.entrySet()) {
                winnerNames.add(entries.getValue());
        }
        System.out.println("1st place: " + winnerNames.get(winnerNames.size() - 1));
        System.out.println("2nd place: " + winnerNames.get(winnerNames.size() - 2));
        System.out.println("3rd place: " + winnerNames.get(winnerNames.size() - 3));
    }
}
