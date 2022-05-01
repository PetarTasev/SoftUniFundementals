package DataTypesAndVariablesExecise;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int max = scanner.nextInt();
        int var = people % max;
        int trips = 0;
        if (var == 0) {
            trips = people / max;
        } else {
            double maxx = max;
            trips = (int) Math.floor(people / maxx) + 1;
        }
        System.out.println(trips);
    }
}
