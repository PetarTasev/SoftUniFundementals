package mapExercices;

import java.util.*;

public class someFacebookBulshit {

    static void sideCreatorAndPersonAdder (Map<String, List<String>> sides, String[] data) {
        if (!sides.containsKey(data[2])) {
            List<String> buffer = new ArrayList<>();
            buffer.add(data[2]);
            sides.put(data[0], buffer);
        } else {
            sides.get(data[0]).add(data[2]);
            sides.put(data[0], sides.get(data[0]));
        }
    }

    public static void main(String[] args) {

        Map<String, List<String>> sides = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String info = scanner.nextLine();
        while (!info.equals("Lumpawaroo")) {
            String[] data1 = info.split(" ");
            String[] data2 = info.split(" -> ");

          if (data2.length == 1) {
              boolean idk = false;
              for (Map.Entry<String, List<String>> entry : sides.entrySet()) {
                          if (entry.getValue().contains(data1[2])) {
                              idk = true;
                              break;
                  }
              }
              if (!idk) {

                  if (!sides.containsKey(data1[2])) {
                      List<String> buffer = new ArrayList<>();
                      buffer.add(data1[2]);
                      sides.put(data1[0], buffer);
                  } else {
                      sides.get(data1[0]).add(data1[2]);
                      sides.put(data1[0], sides.get(data1[0]));
                  }
          }
          } else {
              boolean idk = false;
                    for (Map.Entry<String, List<String>> entry : sides.entrySet()) {
                        if (entry.getValue().contains(data2[0])) {
                            entry.getValue().remove(data2[0]);

                            sideCreatorAndPersonAdder(sides, data2);

                            System.out.println( data2[0] + " joins the " + data2[1] + " side!");
                            idk = true;
                            break;
                        }
                    }
              if (idk) {
                  break;
              }
              sideCreatorAndPersonAdder(sides, data2);
                    System.out.println( data2[0] + " joins the " + data2[1] + " side!");
            }
            info = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : sides.entrySet()) {
            if (!(entry.getValue().size() == 0)) {
            System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
            for(String person : entry.getValue()) {
                System.out.println("! " + person);
            }

        }
        }

    }
}
