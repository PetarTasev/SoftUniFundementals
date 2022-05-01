package exercises;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        int pass = userName.length();
        boolean goIn = false;

        for (int a = 0; a <= 4; a++) {
            String tryer = scanner.nextLine();
            int tryerLength = tryer.length();
            if (tryerLength != pass) {
                System.out.println("Incorrect password. Try again.");
            } else {
                for (int n = 0; n <= pass - 1; n++) {
                    String l1 = String.valueOf(tryer.charAt(n));
                    String l2 = String.valueOf(userName.charAt((pass - 1) - n));
                    if ((l1.equals(l2))) {
                        goIn = true;
                    } else {
                        goIn = false;
                        System.out.println("Incorrect password. Try again.");
                        break;
                    }
                }

            }
            if (goIn) {
                System.out.printf("User %s logged in.", userName);
                break;
            }
        }
        if (!goIn) {
            System.out.printf("User %s blocked!", userName);
        }
    }
}
