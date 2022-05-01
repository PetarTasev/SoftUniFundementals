package arraysExercises;

import java.util.Scanner;

public class kamioFactor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String length = scanner.nextLine();
        int sum = 0;
        int maxSum = 0;
        int combo = 0;
        int maxCombo = 0;
        int[] winner = new int[Integer.parseInt(length)];
        while (true) {
            String newLine = scanner.nextLine();
            if (newLine.equals("Clone them!")){
                break;
            }
            String [] array =  newLine.split("!");
            int [] intArray = new int [array.length];
            for (int n = 0; n < array.length; n++) {
                intArray[n] = Integer.parseInt(array[n]);
                sum += intArray[n];
            }
        }
    }
}
