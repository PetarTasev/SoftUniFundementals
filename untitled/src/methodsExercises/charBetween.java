package methodsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class charBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String stop = scanner.nextLine();

        System.out.println(inBetweenPrinter (start, stop));

    }
    static String inBetweenPrinter (String start, String stop) {
        if ((int)start.charAt(0) > (int)stop.charAt(0)) {
            for (int n = (int) stop.charAt(0) + 1; n < (int) start.charAt(0); n++) {
                char Char = (char) n;
                System.out.print(Char + " ");
            }
        } else {
            for (int n = (int) start.charAt(0) + 1; n < (int) stop.charAt(0); n++) {
                char Char = (char) n;
                System.out.print(Char + " ");
            }
        }
        return "";
    }
}
