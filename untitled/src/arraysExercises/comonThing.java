package arraysExercises;

import java.util.Scanner;

public class comonThing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayOne = scanner.nextLine();
        String arrayTwo = scanner.nextLine();
        String [] firsts = arrayOne.split(" ");
        String [] second = arrayTwo.split(" ");
        for (int s = 0; s < firsts.length; s++) {
            for(int n = 0; n < second.length; n++) {
               if (firsts[s].equals(second[n])) {
                   System.out.print(second[n] + " ");

               }
            }
        }
    }
}
