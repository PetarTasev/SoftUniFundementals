package textProcessing;

import java.util.Scanner;

public class words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while(!word.equals("end")) {
            String[] words = word.split("");
            System.out.print(word + " = ");
            for (int n = words.length - 1; n >= 0; n--) {
                System.out.print(words[n]);
            }
            System.out.println();
            word = scanner.nextLine();
        }
    }
}
