package mapExercices;

import java.util.*;

public class courses {
    public static void main(String[] args) {

        Map<String, List<String>> courseData = new LinkedHashMap<String, List<String>>();
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();

        while (!info.equals("End")) {
            String[] data = info.split(" -> ");

            if (courseData.containsKey(data[0])) {
                if(courseData.get(data[0]).contains(data[1])) {

                } else {
                courseData.get(data[0]).add(data[1]);
                courseData.put(data[0], courseData.get(data[0]));
            }
            } else {
                List <String> filler = new ArrayList<>();
                filler.add(data[1]);
                courseData.put(data[0], filler);
            }
            info = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseData.entrySet()) {
            System.out.println(entry.getKey());
            for(String name :entry.getValue()) {
                System.out.println("-- " + name);
            }
        }

    }
}
