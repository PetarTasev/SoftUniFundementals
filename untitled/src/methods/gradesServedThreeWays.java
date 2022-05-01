package methods;

import java.util.Scanner;

public class gradesServedThreeWays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (type) {
            case "int":
                int x = biggestIntGiver(first, second);
                System.out.println(x);
                break;
            case "char":
                char a = biggestCharGiver(first, second);
                System.out.println(a);
                break;
            case "string":
                String b = biggestStringGiver(first, second);
                System.out.println(b);
                break;
        }
    }

    static int biggestIntGiver (String first, String second) {
        Scanner scanner = new Scanner(System.in);
        int firstt = Integer.parseInt(first);
        int secondd = Integer.parseInt(second);

        if (firstt > secondd) {
            return firstt;
        }

        return secondd;
    }

    static String biggestStringGiver (String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }

    static char biggestCharGiver (String first, String second) {
        char firstt = first.charAt(0);
        char secondd = second.charAt(0);

        if ( firstt > secondd) {
            return firstt;
        }
        return secondd;
    }
}
