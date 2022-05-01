package exercises;

import java.util.Scanner;

public class loginWorkedOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        int pass = userName.length();
        int count = 0;
        boolean go = true;
        String password = "";

        for (int n = pass - 1; n >= 0; n--) {
            String letter = String.valueOf(userName.charAt(n));
            password = password + letter;
        }
        while (true) {
            String tryer = scanner.nextLine();
            if(tryer.equals(password)) {
                System.out.printf("User %s logged in.\n", userName);
                break;
            } else {
                count++;
                if(count >= 4) {
                    System.out.printf("User %s blocked!\n", userName);
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                }
            }
        }
    }
}
