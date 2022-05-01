package arraysExercises;

import java.util.Scanner;

public class equalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] stringArray = line.split(" ");
        int [] array = new int[stringArray.length];

        for (int n = 0; n < stringArray.length; n++){
            array[n] = Integer.parseInt(stringArray[n]);
        }
        boolean fax = false;
        for (int n = 0; n < array.length; n++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int a = n + 1; a < array.length; a++) {
                sum1 += array[a];
            }

            for (int b = 0; b < n; b++) {
                sum2 += array[b];
            }
            if ( sum1 == sum2) {
                System.out.println(n);
                fax = true;
            }
        }
        if (!fax) {
            System.out.println("no");
        }
    }
}
