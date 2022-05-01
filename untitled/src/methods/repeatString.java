package methods;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int repetitions = scanner.nextInt();

        multiplayer(string, repetitions);
    }

    static void multiplayer (String string, int repetitions) {
        for (int n = 0; n < repetitions; n++) {
            System.out.print(string);
        }
    }
}
