package arraysExercises;

import java.util.Scanner;

public class flipedyDypedy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] array = line.split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < rotations; n++) {
            String first = array[0];
            for (int b = 1; b < array.length; b++) {
                array [b - 1] = array [b];
            }
            array [array.length - 1] = first;
        }
        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }
    }
}
