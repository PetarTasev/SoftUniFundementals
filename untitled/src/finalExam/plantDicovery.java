package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class plantDicovery {

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Plant> plants = new ArrayList<>();

        int repetitions = Integer.parseInt(scanner.nextLine());
        for (int  n = 0; n < repetitions; n++) {
            plants.add(new Plant(scanner.nextLine()));
        }

         String thing  = scanner.nextLine();
        while(!thing.equals("Exhibition")) {
            String[] action = thing.split(" - ");
            boolean contains = true;
            for (Plant car : plants) {
                if (car.plant.equals(action[1])) {
                    contains = false;
                }
            }
            if (contains) {
                break;
            }
            switch (action[0]) {
                case "Rate" :
                    plants.contains("");
                    break;
                case "Update" :

                    break;
                case "Reset" :

                    break;
            }
            thing = scanner.nextLine();
        }

        System.out.println("changes");
        System.out.println("No more changes");

    }

    public class Plant {
        String plant;
        int rarity;
        List<Double> rating;

        Plant (String creation) {
            String[] action = creation.split("<->");
            this.plant = action[0];
            this.rarity = Integer.parseInt(action[1]);
        }
        Plant (Double rating) {
            this.rating.add(rating);
        }

        String getPlant () {return this.plant;}
        Integer getRarity () {return this.rarity;}
        double getAverage () {
            double total = 0;
            for (Double rating : this.rating) {
                total += rating;
            }
//            double average = total / this.rating.size() ;
            double salary = Math.round(((total / this.rating.size()) * 100.0) / 100.0);
            return salary;
        }
    }
}
