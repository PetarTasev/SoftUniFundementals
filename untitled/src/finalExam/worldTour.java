package finalExam;

import java.util.Scanner;

public class worldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String travelPlane = scanner.nextLine();

        String modification = scanner.nextLine();

        StringBuilder plan = new StringBuilder();
        plan.append(travelPlane);
        while(!modification.equals("Travel")) {
            String[] adjustment = modification.split(":");
            switch (adjustment[0]) {
                case "Add Stop" :
                    int index = Integer.parseInt(adjustment[1]);
                    String destination = adjustment[2];
                    plan.insert(index, destination);

                    break;
                case "Remove Stop" :
                    int start = Integer.parseInt(adjustment[1]);
                    int stop = Integer.parseInt(adjustment[2]);
                    if (start >= 0 && stop < plan.length()) {
                        plan.replace(start, stop + 1, "");

                    }
                    break;
                case "Switch" :
                    String toBeReplaced = adjustment[1];
                    String replacement = adjustment[2];
                    if (plan.indexOf(toBeReplaced) != -1) {
                        int first = plan.indexOf(toBeReplaced);
                        int last = first + toBeReplaced.length();

                        plan.replace(first, last, replacement);

                    }
            }
            System.out.println(plan);
            modification = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + plan);
    }
}
