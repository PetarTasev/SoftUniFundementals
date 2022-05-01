package arraysExercises;

import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int repetitions = Integer.parseInt(scanner.nextLine());
        int [] individual = new int [repetitions];
        for (int n = 0; n < repetitions; n++) {
            int people = Integer.parseInt(scanner.nextLine());
            individual [n] = people;
            sum += people;
        }
        for (int n = 0; n < repetitions; n++) {
            System.out.print(individual[n] + " ");
        }
        System.out.println();
        System.out.println(sum);
}
}
