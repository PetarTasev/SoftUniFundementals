package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class topInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] arrayString = line.split(" ");
        int [] array = new int[arrayString.length];
        int count = 0;

        for (int n = 0; n < array.length; n++) {
            array [n] = Integer.parseInt(arrayString[n]);
        }

        for (int n = 0; n < array.length; n++) {
            for (int b = n + 1; b < array.length; b++) {
                if (array[n] <= array[b]) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(array[n] + " ");
            }
            count = 0;
        }
    }
}
