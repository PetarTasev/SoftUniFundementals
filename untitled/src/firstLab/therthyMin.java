package firstLab;

import java.util.Arrays;
import java.util.Scanner;

public class therthyMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min += 30;
        if (min >= 60) {
            min -= 60;
            hour++;
        }
        if (hour >= 23) {
            hour -= 24;
        }
        if (min < 10) {
            System.out.printf("%s:0%s", hour, min);
        } else {
            System.out.printf("%s:%s", hour,min);
        }

    }
}
