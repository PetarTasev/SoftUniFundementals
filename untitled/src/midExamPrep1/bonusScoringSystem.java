package midExamPrep1;

import java.util.Scanner;

public class bonusScoringSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  numberOfStudents = Integer.parseInt(scanner.nextLine());
        double numberOfLectures =  Double.parseDouble(scanner.nextLine());
        double additionalBonus =  Double.parseDouble(scanner.nextLine());

        int[] lecturesPerStudent = new int[numberOfStudents];
        for (int n = 0; n < numberOfStudents; n++) {
            String line = scanner.nextLine();
            if (!line.equals("")) {
                lecturesPerStudent[n] += Integer.parseInt(line);
            }

        }


        int maxAttendance = -1;
        double maxTotalBonus = -1;
        for (int n = 0; n < numberOfStudents; n++) {
            double totalBonus = (lecturesPerStudent[n] * 1.0 / numberOfLectures * 1.0 * (5 + additionalBonus));
            if (totalBonus > maxTotalBonus) {
                maxTotalBonus = totalBonus;
                maxAttendance = n;
            }
        }

        System.out.printf("Max Bonus: %.0f.\n", maxTotalBonus);
        System.out.printf("The student has attended %s lectures.\n", lecturesPerStudent[maxAttendance]);
    }

}
