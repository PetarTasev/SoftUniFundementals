package methodsExercises;

import java.util.Scanner;

public class smallestOfTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = new String[] { scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};

        System.out.println(Smallest(numbers));
    }

    static int Smallest (String[] numbers) {
        int max = 999999999;
        for (int n = 0; n < 3; n++) {
            if (Integer.parseInt(numbers[n]) < max) {
                max = Integer.parseInt(numbers[n]);
            }
        }
        return max;
    }
}
