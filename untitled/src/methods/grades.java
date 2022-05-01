package methods;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();
        String status = "";
        if (grade <= 2.99) {
            status = "Fail";
        } else if (grade <= 3.49)  {
            status = "Poor";
        } else if (grade <= 4.49)  {
            status = "Good";
        } else if (grade <= 5.49)  {
            status = "Very good";
        } else if (grade <= 6.00)  {
            status = "Excellent";
        }
        System.out.println(status);
    }
}

//        •	2.00 – 2.99 - "Fail"
//        •	3.00 – 3.49 - ""
//        •	3.50 –  - ""
//        •	4.50 – 5.49 - ""
//        •	5.50 – 6.00 - ""
