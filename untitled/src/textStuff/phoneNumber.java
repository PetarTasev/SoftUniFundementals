package textStuff;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lineOfNumbers);

        boolean correctPhoneNumber = matcher.find();

        while(correctPhoneNumber) {
            System.out.print(matcher.group());
            correctPhoneNumber = matcher.find();
               if (correctPhoneNumber) {
                System.out.print(", ");
            }
        }
    }
}
