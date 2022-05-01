package finalEXAMM;

import java.io.LineNumberInputStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initial = scanner.nextLine();
        StringBuilder password = new StringBuilder(initial);
        String[] error = {"yes"};
        String command = scanner.nextLine();
        while(!command.equals("Complete"))  {
            String[] action = command.split(" ");
            switch (action[0]) {
                case "Make" :
                    switch (action[1]) {
                        case "Upper" :
                            // works100%
                            String indexed = String.valueOf(initial.charAt(Integer.parseInt(action[2])));
                            String newCher = indexed.toUpperCase(Locale.ROOT);
                            password.replace(Integer.parseInt(action[2]), Integer.parseInt(action[2]) + 1, newCher);
                            System.out.println(password);
                            break;
                        case "Lower" :
                            // works100%
                            String givenChar = String.valueOf(initial.charAt(Integer.parseInt(action[2])));
                            String lowercased = givenChar.toLowerCase(Locale.ROOT);
                            password.replace(Integer.parseInt(action[2]), Integer.parseInt(action[2]) + 1, lowercased);
                            System.out.println(password);
                            break;
                    }
                    break;
                case "Insert" :
                    // works100%
                    int index = Integer.parseInt(action[1]);
                    if (index >= 0 && index < password.length()) {
                        password.insert(index, action[2]);
                        System.out.println(password);
                    }
                    break;
                case "Replace" :
                    // works100%
                    if (initial.contains(action[1])) {
                        char letter = action[1].charAt(0);
                        int base = (int) letter;
                        int add = Integer.parseInt(action[2]);
                        int total = add + base;
                        char neww = (char) total;
                        initial = initial.replace(action[1], String.valueOf(neww));
                        password.setLength(0);
                        password.append(initial);
                        password.append(" ");
                        System.out.println(password);
                    }
                    break;
                case "Validation" :
                    if (password.length() < 8) {
                        // works100%
                        System.out.println("Password must be at least 8 characters long!");
                    }

                    Pattern pattern = Pattern.compile("^[\\w0-9]+$");
                    Matcher matcher = pattern.matcher(password);
                    int parts = 0;
                    boolean find = matcher.find();
                    while(find) {
                        parts++;
                        find = matcher.find();
                    }
                    if (parts != 1) {
                        //works100%
                        System.out.println("Password must consist only of letters, digits and _!");
                    }
                    pattern = Pattern.compile("[A-Z]");
                    matcher = pattern.matcher(password);

                    int upper = 0;
                    find = matcher.find();
                    while(find) {
                        upper++;
                        find = matcher.find();
                    }
                    if (!(upper > 0)) {
                        //we shall see
                        System.out.println("Password must consist at least one uppercase letter!");
                    }
                    pattern = Pattern.compile("[a-z]");
                    matcher = pattern.matcher(password);

                    int lower = 0;
                    find = matcher.find();
                    while(find) {
                        lower++;
                        find = matcher.find();
                    }
                    if (!(lower > 0)) {
                        //works100%
                        System.out.println("Password must consist at least one lowercase letter!");
                    }
                    pattern = Pattern.compile("[0-9]");
                    matcher = pattern.matcher(password);

                    int digits = 0;
                    find = matcher.find();
                    while(find) {
                        digits++;
                        find = matcher.find();
                    }
                    if (!(digits > 0)) {
                        //we shall see
                        // work on it more hehe
                        System.out.println("Password must consist at least one digit!");
//                        String test = error[34];
                    }
                    break;
            }
            initial = password.toString();
            command = scanner.nextLine();
        }
    }
}
