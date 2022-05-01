package midExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> biggest = new ArrayList<Integer>();
        double average = 0;
        for (int n = 0; n < numbers.size(); n++) {
            average += numbers.get(n);
        }
        average = average / numbers.size();
        int count = 0;
        for (int n = 0; n < numbers.size(); n++) {
            if (numbers.get(n) > average) {
                biggest.add(numbers.get(n));
                count++;
            }
        }
        int min = 99999999;
        int maxIndex = 0;
        while (biggest.size() > 5) {
            for (int n = 0; n < biggest.size(); n++) {
                if (biggest.get(n) < min) {
                    min = biggest.get(n);
                    maxIndex = n;
                }
            }
            biggest.remove(maxIndex);
            min = 99999999;
            maxIndex = 0;
        }

        int max = -99999999;
        maxIndex = 0;
        if (biggest.size() == 0) {
            System.out.println("No");
            return;
        }
        while (biggest.size() > 0) {
            for (int n = 0; n < biggest.size(); n++) {
                if (biggest.get(n) > max) {
                    max = biggest.get(n);
                    maxIndex = n;
                }
            }
            System.out.print(biggest.get(maxIndex) + " ");
            biggest.remove(maxIndex);
            max = -99999999;
            maxIndex = 0;
        }
    }
}
