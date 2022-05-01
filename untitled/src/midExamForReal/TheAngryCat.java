package midExamForReal;

import java.util.Scanner;

public class TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String[] items = line.split(", ");
        int index = Integer.parseInt(scanner.nextLine());
        String cheapOrExpensive = scanner.nextLine();

        int sum1 = 0;
        int sum2 = 0;


        switch (cheapOrExpensive) {
            case "cheap":
                for (int n = 0; n < items.length; n++) {
                    if (n != index && Integer.parseInt(items[n]) < Integer.parseInt(items[index])) {
                        if (n < index) {
                            sum1 += Integer.parseInt(items[n]);
                        } else {
                            sum2 +=  Integer.parseInt(items[n]);
                        }

                    }
                }

                break;
            case "expensive":
                for (int n = 0; n < items.length; n++) {
                    if (n != index && Integer.parseInt(items[n]) >= Integer.parseInt(items[index])) {
                        if (n < index) {
                            sum1 += Integer.parseInt(items[n]);
                        } else {
                            sum2 +=  Integer.parseInt(items[n]);
                        }

                    }
                }
                break;
        }
        if (sum1 >= sum2) {
            System.out.printf("Left - %s", sum1);
        } else {
            System.out.printf("Right - %s", sum2);
        }
    }
}
