package mapExercices;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {

        Map<String, List<Double>> student = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        int reps = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < reps; n++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (student.containsKey(name)) {
                student.get(name).add(grade);
                student.put(name, student.get(name));
            } else {
                List<Double> buffer = new ArrayList<>();
                buffer.add(grade);
                student.put(name, buffer);
            }
        }

        for (Map.Entry<String, List<Double>> entry : student.entrySet()) {
            double total = 0;
            double average = 0;
            for(Double grade : entry.getValue()) {
                total+= grade;
            }
            average = total / entry.getValue().size();

            if (average >= 4.5) {
                System.out.printf("%s -> %.2f\n", entry.getKey(), average);
            }
        }

    }
}
