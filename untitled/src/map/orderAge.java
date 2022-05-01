package map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class orderAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String[]> people = new TreeMap<Integer, String[]>();

        String personLine = scanner.nextLine();
        while(!personLine.equals("End")) {
            String[] infoIn = personLine.split(" ");
            String[] nameID = new String[] {infoIn[0], infoIn[1]};

            people.put(Integer.parseInt(infoIn[2]), nameID);
            personLine = scanner.nextLine();
        }

        for (Map.Entry<Integer, String[]> entry : people.entrySet()) {
            System.out.println(entry.getValue()[0] + " with ID: " + entry.getValue()[1] + " is " + entry.getKey() + " years old.");
        }
    }
}
