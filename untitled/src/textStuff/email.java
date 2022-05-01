package textStuff;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b([A-Za-z0-9][\\-._][A-z0-9]|[A-Za-z0-9])+@((([A-Za-z][\\-][A-z]|[A-Za-z])+\\.([A-Za-z][\\-][A-z]|[A-Za-z])+)|(\\.([A-Za-z][\\-][A-z]|[A-Za-z])+))+\\b";
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        boolean validEmail = matcher.find();
        while(validEmail) {
            System.out.println(matcher.group());
            validEmail = matcher.find();
        }
    }
}
