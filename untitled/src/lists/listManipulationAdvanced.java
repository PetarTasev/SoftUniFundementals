package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] action = command.split(" ");
            switch (action[0]) {
                case "Contains":
                    Contains(list, Integer.parseInt(action[1]));
                    break;
                case "Print":
                    Print(list, action[1]);
                    break;
                case "Get":
                    GetSum(list);
                    break;
                case "Filter":
                    Filter(list, action[1], Integer.parseInt(action[2]));
                    break;
            }
            command = scanner.nextLine();
        }
    }
    static void Contains (List<Integer> list, int number) {
        for (int n = 0; n < list.size(); n++) {
            if (list.get(n) == number) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No such number");
    }
    static void Print (List<Integer> list, String evenOrOdd) {
        int evenOdd= 12;
        if (evenOrOdd.equals("even")) {
            evenOdd = 0;
        } else {
            evenOdd = 1;
        }
        for (int n = 0; n < list.size(); n++) {
            if (list.get(n) % 2 == evenOdd) {
                if (n > 0) {
                    System.out.print(" ");
                    System.out.print(list.get(n));
                } else {
                    System.out.print(list.get(n));
                }
            }
        }
        System.out.println();
    }
    static void GetSum (List<Integer> list) {
        int sum = 0;
        for (int n = 0; n < list.size(); n++) {
            sum += list.get(n);
        }
        System.out.println(sum);
    }
    static void Filter (List<Integer> list, String condition, int number) {
        switch (condition) {
            case "<":
                for (int n = 0; n < list.size(); n++) {
                    if (list.get(n) < number) {
                        System.out.print(list.get(n));
                        System.out.print(" ");
                    }
            }
                break;
            case ">":
                for (int n = 0; n < list.size(); n++) {
                    if (list.get(n) > number) {
                        System.out.print(list.get(n));
                        System.out.print(" ");
                    }
                }
                break;
            case ">=":
                for (int n = 0; n < list.size(); n++) {
                    if (list.get(n) >= number) {
                        System.out.print(list.get(n));
                        System.out.print(" ");
                    }
                }
                break;
            case "<=":
                for (int n = 0; n < list.size(); n++) {
                    if (list.get(n) <= number) {
                        System.out.print(list.get(n));
                        System.out.print(" ");
                    }
                }
                break;

        }
        System.out.println();
    }
}
