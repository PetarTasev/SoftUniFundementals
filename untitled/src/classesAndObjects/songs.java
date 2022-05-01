package classesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {

    static class Song {
        String type;
        String name;

        Song (String line) {
            String[] thing = line.split("_");
            this.type = thing[0];
            this.name = thing[1];
        }
        String getType() {
            return this.type;
        }
        String getName() {
            return this.name;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Song> list = new ArrayList<Song>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int n = 0; n < number; n++) {
            list.add(new Song(scanner.nextLine()));
        }

        String typeNeeded = scanner.nextLine();

        if (typeNeeded.equals("all")) {
            for (int n = 0; n < number; n++) {
                System.out.println(list.get(n).getName());
            }
        } else {
            for (int n = 0; n < number; n++) {
                if (list.get(n).getType().equals(typeNeeded)) {
                    System.out.println(list.get(n).getName());
                }
            }
        }
    }
}
