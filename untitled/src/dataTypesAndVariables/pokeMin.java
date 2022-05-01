package dataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class pokeMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.nextLine());
    int M = Integer.parseInt(scanner.nextLine());
    int Y = Integer.parseInt(scanner.nextLine());
    int count = 0;
        double yoMama = N / 2.0;
        while (N >= M) {
            N -= M;
            count++;
            if (yoMama == N) {
                if (Y == 0) {

                } else {
                    N = N / Y;
                }
            }
        }
        System.out.println(N);
        System.out.println(count);
    }
}
