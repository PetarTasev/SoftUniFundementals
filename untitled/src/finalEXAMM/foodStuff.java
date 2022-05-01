package finalEXAMM;

import java.util.*;

public class foodStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> preferences =  new LinkedHashMap<>();
        int disliked = 0;
        String command = scanner.nextLine();
        while(!command.equals("Stop")) {
            String[] feedback = command.split("-");
            switch (feedback[0]) {
                case "Like" :
                    if (preferences.containsKey(feedback[1])) {
                        List<String> food = preferences.get(feedback[1]);
                        if (!preferences.get(feedback[1]).contains(feedback[2])) {
                            food.add(feedback[2]);
                            preferences.put(feedback[1], food);
                        }
                    } else {
                        List<String> food = new ArrayList<>();
                        food.add(feedback[2]);
                        preferences.put(feedback[1], food);
                    }
                    break;
                case "Dislike" :
                    if (!preferences.containsKey(feedback[1])) {
                        System.out.println(feedback[1] + " is not at the party.");
                    } else {
                        if (preferences.get(feedback[1]).contains(feedback[2])) {
                            List<String> food = preferences.get(feedback[1]);
                            food.remove(feedback[2]);
                            preferences.put(feedback[1], food);
                            disliked++;
                            System.out.println(feedback[1] + " doesn't like the " + feedback[2] + ".");
                        } else {
                            System.out.println(feedback[1] + " doesn't have the " + feedback[2] + " in his/her collection.");
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : preferences.entrySet()) {
            String person = entry.getKey();
            String food = String.join( ", ", entry.getValue() );
            System.out.println(person + ": " + food);
        }
        System.out.println("Unliked meals: " + disliked);
    }
}
