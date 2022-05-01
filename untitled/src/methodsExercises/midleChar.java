package methodsExercises;

import java.util.Scanner;

public class midleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.length() % 2 == 0) {
            System.out.println(evenMiddleNumberSeparator(word));
        } else {
            System.out.println(oddMiddleNumberSeparator(word));
        }
    }
    static String evenMiddleNumberSeparator (String word) {
        int firstPosition = (word.length() / 2) - 1;
        int secondPosition = firstPosition + 1;
        String middle = String.valueOf(word.charAt(firstPosition)) + String.valueOf(word.charAt(secondPosition));
        return middle;
    }

    static String oddMiddleNumberSeparator (String word) {
        int middleLocation = word.length() / 2;
        String middle = String.valueOf(word.charAt(middleLocation));
        return middle;
    }
}
