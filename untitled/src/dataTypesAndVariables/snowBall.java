package dataTypesAndVariables;

import java.util.Scanner;

public class snowBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balls = Integer.parseInt(scanner.nextLine());

        int m1 = 0;
        int m2 = 0;
        double m3 = 0;
        int m4 = 0;

        for(int n = 0; n < balls; n++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
                if (snowballValue > m3) {
                    m4 = snowballQuality;
                    m3 = snowballValue;
                    m2 = snowballTime;
                    m1 = snowballSnow;
            }
        }
        System.out.printf("%s : %S = %.0f (%s)", m1, m2, m3, m4);
    }
}
