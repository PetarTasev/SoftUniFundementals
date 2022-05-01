package finalExam1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class barcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int barCodes = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < barCodes; n++) {
            String barcode = scanner.nextLine();
            Pattern pattern = Pattern.compile("@#+[A-Z][A-Za-z\\d]{4,}[A-Z]@#+");
            Matcher matcher = pattern.matcher(barcode);

            boolean valid = false;
            boolean find = matcher.find();
            while (find) {
                valid = true;
                find = matcher.find();
            }
            if (valid) {
                Pattern group = Pattern.compile("\\d+");
                Matcher groupFonder = group.matcher(barcode);
                String grouper = "";
                valid = groupFonder.find();
                while (valid) {
                    grouper += groupFonder.group();
                    valid = groupFonder.find();
                }
                if (grouper.equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + grouper);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
