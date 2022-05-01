package exercises;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= number; a++) {
            for (int n = 1; n <= a; n++) {
                System.out.printf("%s ", a);
            }
            System.out.println("");
        }
    }
}
