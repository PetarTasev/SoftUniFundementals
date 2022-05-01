package finalExam;

import java.util.*;

public class plantThingMyWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> list = new LinkedHashMap<>();

        int repetition = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < repetition; n++) {
            String[] action = scanner.nextLine().split("<->");
            if (list.containsKey(action[1])) {
                List<Double> thing = list.get(action[0]);
                thing.add(Double.parseDouble(action[1]));
                list.put(action[0], thing);
            } else {
                List<Double> thing = new ArrayList<Double>();
                thing.add(Double.parseDouble(action[1]));
                list.put(action[0], thing);
            }
        }


    }
}
