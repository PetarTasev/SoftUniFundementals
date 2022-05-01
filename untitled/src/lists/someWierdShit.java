package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class someWierdShit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        List<Double> finalArray = new ArrayList<Double>();

        for (int n = 0; n < numbers.size() / 2; n++) {
            finalArray.add(numbers.get(n) +  numbers.get(numbers.size() - n - 1) );
        }
        if (numbers.size() % 2 == 1) {
            finalArray.add( numbers.get(numbers.size() / 2));
        }

        for (int n = 0; n < finalArray.size(); n++) {
            if (finalArray.get(n) % 1 == 0) {
                System.out.printf("%.0f" + " ", finalArray.get(n));
            } else {
                System.out.print(finalArray.get(n));
                System.out.print(" ");
            }
        }
    }
}
