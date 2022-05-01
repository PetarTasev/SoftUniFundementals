package methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class toThePowerOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int  power = Integer.parseInt(scanner.nextLine());



            System.out.println( new DecimalFormat("0.####").format(MathMultiplayer(number, power)));

    }
    static double MathMultiplayer (double number, int  power) {
        double sum = Math.pow(number, power);
        return sum;
    }
}
