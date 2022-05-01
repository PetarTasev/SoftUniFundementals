package listExercises;

import java.util.Scanner;

public class appendArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bigList = scanner.nextLine().split("\\s*\\|\\s*");

        for (int n = bigList.length - 1; n >= 0; n--) {
            String[] list = bigList[n].split("\\s+");

            if (bigList[n].equals("")) {
                continue;
            }
            for (int a = 0; a < list.length; a++) {
                System.out.print(list[a] + " ");
            }
        }
    }
}
