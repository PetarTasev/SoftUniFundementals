package textStuff;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nameRecongnition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineOfNames = scanner.nextLine();
        String regex = "\\b([A-Z][a-z]+ [A-Z][a-z]+)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lineOfNames);

        boolean nameFound = matcher.find();
        while (nameFound) {
            System.out.print(matcher.group() + " ");
            nameFound = matcher.find();
        }
    }
}
