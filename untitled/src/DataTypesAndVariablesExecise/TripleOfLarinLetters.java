package DataTypesAndVariablesExecise;

import java.util.Scanner;

public class TripleOfLarinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            for (int n = 0; n < number; n++) {
                for (int a = 0; a < number; a++) {
                    for (int b = 0; b < number; b++) {
                        char character1 = (char) (n + 'a');
                        char character2 = (char) (a + 'a');
                        char character3 = (char) (b + 'a');
                        System.out.print(character1);
                        System.out.print(character2);
                        System.out.print(character3);
                        System.out.println();
                    }
                }
            }
        }
    }
