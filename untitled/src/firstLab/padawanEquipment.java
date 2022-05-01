package firstLab;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaber = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());

        double freeBelt =  Math.floor(students / 6.0);

        double  total = (Math.ceil(students * 1.10) * lightSaber) + students * robe + (students - freeBelt) * belt;

        double diff = budget - total;
        double some = total - budget;
        if (diff >= 0) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", some);
        }
    }
}
