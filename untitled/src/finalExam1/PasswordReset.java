package finalExam1;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initial = scanner.nextLine();

        StringBuilder password = new StringBuilder();
        password.append(initial);

        String modifications = scanner.nextLine();
        while (!modifications.equals("Done")) {
            String[] action = modifications.split(" ");
            boolean stall = false;
            switch (action[0]) {
                case "TakeOdd":
                    String newPass = "";
                    int length = password.length();
                    for (int n = 0; n < length; n++) {
                        if (n % 2 != 0) {
                            newPass += String.valueOf(password.charAt(n));
                        }
                    }
                    password.setLength(0);
                    password.append(newPass);
                    break;
                case "Cut":
                    password.delete(Integer.parseInt(action[1]), Integer.parseInt(action[1]) + Integer.parseInt(action[2]));
                    break;
                case "Substitute":
                    String toBeReplaced = action[1];
                    String replacement = action[2];


                    String thing = password.toString();
                    if (thing.contains(toBeReplaced)) {

                        boolean entry = thing.contains(toBeReplaced);

                        thing = thing.replace(toBeReplaced, replacement);

                        password.setLength(0);
                        password.append(thing);
                    } else {
                        System.out.println("Nothing to replace!");
                        modifications = scanner.nextLine();
                        continue;
                    }
                    break;

            }
            System.out.println(password);
            modifications = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
