package finalEXAMM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class incription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repetitions = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < repetitions; n++) {
            Pattern pattern = Pattern.compile("^([\\w\\W\\d\\d]+)>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<(\\1)$");
            Matcher matcher = pattern.matcher(scanner.nextLine());

            boolean find = matcher.find();
            if (find) {
                System.out.println("Password: " + matcher.group(2) + matcher.group(3) + matcher.group(4) + matcher.group(5));
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
