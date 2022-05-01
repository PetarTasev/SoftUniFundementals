package textProcessing;

import java.util.Scanner;

public class digitsStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String letters = "";
        String digits = "";
        String other = "";
        for (int n = 0; n < text.length(); n++) {
            if (Character.isDigit(text.charAt(n))) {
                digits += String.valueOf(text.charAt(n));
            } else if (Character.isAlphabetic(text.charAt(n))) {
                letters += String.valueOf(text.charAt(n));
            } else {
                other += String.valueOf(text.charAt(n));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}
