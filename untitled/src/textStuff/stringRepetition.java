package textStuff;

import java.util.Scanner;

public class stringRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");

        for (String word : array) {
            int reps = word.length();
            for (int n = 0; n < reps; n++) {
                System.out.print(word);
            }
        }
    }
}
