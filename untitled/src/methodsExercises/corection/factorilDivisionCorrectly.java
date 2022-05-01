package methodsExercises.corection;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.function.BiFunction;

public class factorilDivisionCorrectly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        String[] error = new String[1];

        BigDecimal firstFactorial = new BigDecimal(1);
        for (int n = 1; n <= firstNumber; n++) {
            BigDecimal number = new BigDecimal(n);
            firstFactorial = firstFactorial.multiply(number);
        }
        BigDecimal secondFactorial = new BigDecimal(1);
        for (int n = 1; n <= secondNumber; n++) {
            BigDecimal number = new BigDecimal(n);
            secondFactorial = secondFactorial.multiply(number);
        }
        int scale = 6;
        BigDecimal division = firstFactorial.divide(secondFactorial, scale, RoundingMode.FLOOR);
        System.out.printf("%.2f", division);
    }
}
