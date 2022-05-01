package arrays;

import java.util.Scanner;

public class dnaTHings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int sampleNumber = 0;
        int sum = 0;
        int maxSum = 0;
        String dna = scanner.nextLine();
        int max [] = new int [length];
        while (!dna.equals("Clone them!")) {
            String[] dnaArray = new String[length];
            dnaArray = dna.split("!");
            int[] intDna = new int[length];
            sampleNumber++;
            for (int n = 0; n < length; n++) {
                intDna [n] = Integer.parseInt(dnaArray[n]);
                sum += intDna [n];
            }

        }
    }
}
