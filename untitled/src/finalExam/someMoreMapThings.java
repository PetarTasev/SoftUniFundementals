package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class someMoreMapThings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> locations = new ArrayList<>();
        int total = 0;

        String line = scanner.nextLine();
        Pattern pattern = Pattern.compile("([=/])([A-Z][A-Za-z]{2,})(\\1)");
        Matcher matcher = pattern.matcher(line);

        boolean find = matcher.find();
        while(find) {
            locations.add(matcher.group(2));
            total += matcher.group(2).length();
            find = matcher.find();
        }

        String destinations = String.join(", ", locations);
        System.out.println("Destinations: " + destinations);
        System.out.println("Travel Points: " + total);
    }
}
