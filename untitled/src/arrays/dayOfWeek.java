package arrays;

import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt() ;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if ( number > 0 && number < 8 ) {
            System.out.print(days[number - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
