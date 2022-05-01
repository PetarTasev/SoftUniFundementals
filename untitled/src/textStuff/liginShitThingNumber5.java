package textStuff;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class liginShitThingNumber5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersOne = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());

        String[] error = new String[] {"1"};

        for (String ailean : numbersOne) {

            String regex = "((-?\\d+\\.\\d+)|(-?\\d+))|[/*]";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ailean);

            boolean stop = false;
            for (int n = 0; n < ailean.length(); n++) {
                String letter = String.valueOf(ailean.charAt(n));
                if (letter.equals(" ") || letter.equals(",")) {
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
            double total = 0.0;
            boolean count = matcher.find();
            while(count) {
                String test = matcher.group();
                if (matcher.group().equals("/")) {
                    total = total / 2;
                } else if (matcher.group().equals("*")) {
                    total = total * 2;
                } else {
                    total += Double.parseDouble(matcher.group());
                }
                count = matcher.find();
            }

            regex = "[^[0-9]+\\-*/.]";

            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(ailean);

            int power = 0;
            count = matcher.find();
            while(count) {
                char letter = matcher.group().charAt(0);
               power += letter;
                count = matcher.find();
            }

            System.out.print(ailean + " - " + power + " health, ");
            System.out.printf("%.2f damage\n", total);
        }

    }
}
