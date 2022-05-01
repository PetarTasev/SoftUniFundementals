package textStuff;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sofuUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$.%]*?<(?<product>\\w+)>[^|$.%]*?\\|(?<count>\\d+)\\|[^|$.%]*?(?<south>\\d+\\.?\\d+)\\$";
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        double fullExpense = 0;
        while (!line.equals("end of shift")) {
            Matcher matcher = pattern.matcher(line);

            boolean valid = matcher.find();
            if(valid) {
                double price = Double.parseDouble(matcher.group(4));
                double total = price * Double.parseDouble(matcher.group("count"));
                System.out.print(matcher.group("name") + ": " + matcher.group("product") + " - ");
                System.out.printf("%.2f\n", total);
                fullExpense += total;
            }

            line = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", fullExpense);
    }
}
