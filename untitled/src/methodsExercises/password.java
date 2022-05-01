package methodsExercises;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();


        if (!(isThePassword6to10char(password))) {
            System.out.print("Password must be between 6 and 10 characters");
            System.out.println();
        } else {
            System.out.print("");
        }

        if (!isThePasswordOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }else {
            System.out.print("");
        }

        if (!isLongerThan2(password)) {
            System.out.println("Password must have at least 2 digits");
        }else {
            System.out.print("");
        }

        if ( (isThePassword6to10char (password)) && isThePasswordOnlyLettersAndDigits(password) && isLongerThan2(password)) {
            System.out.println("Password is valid");
        }
    }
    static Boolean isThePassword6to10char (String password) {
        int count = 0;
        for (int n = 0; n < password.length(); n++) {
            if ((password.charAt(n) >= 65 && password.charAt(n) <= 90) || (password.charAt(n) >= 97 && password.charAt(n) <= 122)) {
                count++;
            }
        }
        if (count <= 10 && count >= 6) {
            return true;
        } else {
            return false;
        }
    }
    static Boolean isThePasswordOnlyLettersAndDigits (String password) {
        Boolean idk = true;
        for (int n = 0; n < password.length(); n++) {
            if ( (password.charAt(n) >= 48 && password.charAt(n) <= 57)  || (password.charAt(n) >= 65 && password.charAt(n) <= 90) || (password.charAt(n) >= 97 && password.charAt(n) <= 122)) {
            } else {
                idk = false;
            }
        }
        return idk;
    }
    static Boolean isLongerThan2 (String password) {
        int count = 0;
        for (int n = 0; n < password.length(); n++) {
            if ((password.charAt(n) >= 48 && password.charAt(n) <= 57)) {
                count++;
            }
        }
        if ( count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
