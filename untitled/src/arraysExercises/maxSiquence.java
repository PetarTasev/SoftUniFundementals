package arraysExercises;

import java.util.Scanner;

public class maxSiquence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] stringArray = line.split(" ");
        int [] array = new int[stringArray.length];

        for (int n = 0; n < stringArray.length; n++) {
            array [n] = Integer.parseInt(stringArray[n]);
        }

        int count = 1;
        int maxCount = 0;
        int givenNumber = 0;

        for (int n = 0; n < array.length - 1; n++) {
            if(array[n] == array[n + 1]){
                count++;
            } else {
                    count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                givenNumber = array[n];
            }
        }

        for (int n = 0; n < maxCount; n++) {
            System.out.print(givenNumber + " ");
        }
    }
}
