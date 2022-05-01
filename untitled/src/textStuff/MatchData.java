package textStuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<name>\\w+)<<(?<price>\\d+|\\d+.\\d+)!(?<quantity>\\d+)";

        Pattern pattern = Pattern.compile(regex);

        List<String> product = new ArrayList<String>();

        double total = 0;

        String item = scanner.nextLine();
        while(!item.equals("Purchase")) {

            Matcher matcher = pattern.matcher(item);

            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group("price"));
                double amount = Double.parseDouble(matcher.group("quantity"));
                product.add(matcher.group("name"));
                total += price * amount;
            }
            item = scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        for(String thing : product) {
            System.out.println(thing);
        }
        System.out.printf("Total money spend: %.2f", total);
    }
}
