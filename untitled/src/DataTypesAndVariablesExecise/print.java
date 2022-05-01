package DataTypesAndVariablesExecise;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int  stop = Integer.parseInt(scanner.nextLine());
        for (int n = start; n <= stop; n++) {
            int number = n;
            char baby = (char) number;
            System.out.print(baby + " ");
        }
    }
}
