package midExamPrep;

import java.util.Scanner;

public class compiterStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int therd = Integer.parseInt(scanner.nextLine());
        int totalQuestionsPerHour = first + second + therd;
        int totalQuestion = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        int count = 0;

        while (totalQuestion > 0) {
            hours++;
            if (!(hours % 4 == 0)) {
                totalQuestion -= totalQuestionsPerHour;
            }
        }
        System.out.printf("Time needed: %sh.", hours);
    }
}
