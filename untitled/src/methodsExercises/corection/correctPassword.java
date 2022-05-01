package methodsExercises.corection;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class correctPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean valid = true;

        if (!isItLongEnough(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            valid = false;
        }
        if (!containsOnlyLetterAndDigit(password)) {
            System.out.println("Password must consist only of letters and digits");
            valid = false;
        }
        if (!hasAtLest2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
            valid = false;
        }
        if (valid) {
            System.out.println("Password is valid");
        }
    }

    static boolean isItLongEnough (String password) {
        if (password.length() >= 6 &&  password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
    static boolean hasAtLest2Digits (String password) {
        String regex = "[\\d]";
        int count = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        boolean exists = matcher.find();
        while(exists) {
            count++;
            exists = matcher.find();
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
    static boolean containsOnlyLetterAndDigit (String password) {
        String regex = "\\d|[A-Za-z]";
        int count = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        boolean contains = matcher.find();
        while(contains) {
            count++;
            contains = matcher.find();
        }
        if (count == password.length()) {
            return true;
        } else {
            return false;
        }
    }
}
