package arraysExercises;

import java.util.Scanner;

public class zigzagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean fax = true;
        int repetitions = Integer.parseInt(scanner.nextLine());
        String [] one = new String [repetitions];
        String [] two = new String [repetitions];
        for (int n = 0; n < repetitions; n++) {
            String individualLine = scanner.nextLine();
            String [] array = individualLine.split(" ");
            if (fax) {
                one [n] = array [0];
                two [n] = array [1];
            } else {
                one [n] = array [1];
                two [n] = array [0];
            }
            fax = !fax;
        }
        for (int n = 0; n < repetitions; n++) {
            System.out.print(one[n] + " ");
        }
        System.out.println();
        for (int n = 0; n < repetitions; n++) {
            System.out.print(two[n] + " ");
        }
    }
}
