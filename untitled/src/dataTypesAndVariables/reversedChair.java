package dataTypesAndVariables;

import java.util.Scanner;

public class reversedChair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one = (scanner.nextLine()).charAt(0);
        char two = (scanner.nextLine()).charAt(0);
        char tree = (scanner.nextLine()).charAt(0);

        System.out.println( tree + " " + two + " " + one);
    }
}
