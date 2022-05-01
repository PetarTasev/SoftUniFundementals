package firstLab;

import java.util.Scanner;

public class foreignLanguage {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            String in = scanner.nextLine();
            switch (in) {
                case "USA":
                case "England":
                    System.out.println("English");
                    break;
                case "Spain":
                case "Argentina":
                case "Mexico":
                    System.out.println("Spanish");
                    break;
                default :
                    System.out.println("unknown");
            }

    }
}
