package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] stringArray = line.split(" ");
        int [] array = new int[stringArray.length];

        for (int n = 0; n < stringArray.length; n++) {
             array [n] = Integer.parseInt(stringArray[n]);
        }
        int sum = scanner.nextInt();
        for (int n = 0; n < array.length; n++) {
            for (int b = 0; b < array.length; b++) {
                if ( n != b && array[n] + array[b] == sum) {
                    System.out.print(array[n] + " " + array[b]);
                    System.out.println();
                    array[n] = 999999999;
                    array[b] = 999999999;
                }
            }
        }
    }
}
