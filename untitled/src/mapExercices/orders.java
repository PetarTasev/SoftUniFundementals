package mapExercices;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, double[]> items = new LinkedHashMap<String, double[]>();
        String line = scanner.nextLine();
        while (!line.equals("buy")) {
            String[] things = line.split(" ");
            double[] numbers = new double[2];
            numbers[0] =  Double.parseDouble(things[1]);
            numbers[1] =  Double.parseDouble(things[2]);

            boolean newValue = items.containsKey(things[0]);

            if (!newValue) {
                items.put(things[0], numbers);
            } else {
                double oldValue = (items.get(things[0]))[1];
                double newInt = numbers[1];
                double total = oldValue + newInt;
                numbers[1] = total;
                items.put(things[0], numbers);
            }
            line = scanner.nextLine();
        }

        for (Map.Entry<String, double[]> entry : items.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()[1] * entry.getValue()[0]);
        }

    }
}
