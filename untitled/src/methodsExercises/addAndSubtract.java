package methodsExercises;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());
        int tree = Integer.parseInt(scanner.nextLine());
        System.out.println(one + two - tree);
    }
}
//    int[] one = new int[index + 1];
//    int[] two = new int[array.length - index - 1];
//           for (int n = 0; n < index; n++) {
//        one[n] = array[n];
//        }
//        for (int n = index - 1 ; n < array.length; n++) {
//
//        }
