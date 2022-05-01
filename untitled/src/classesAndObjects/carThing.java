package classesAndObjects;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class carThing {
    static class Car {
        String type;
        String model;
        String color;
        int horsePower;

        Car(String line) {
            String[] info = line.split(" ");
            this.type = info[0];
            this.model = info[1];
            this.color = info[2];
            this.horsePower = Integer.parseInt(info[3]);


        }


        String getType() {
            return type;
        }
        String getModel() {
            return model;
        }
        String getColor() {
            return color;
        }
        int getHorsePoewer() {
            return horsePower;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> list = new ArrayList<Car>();
        String command = scanner.nextLine();

        int totalHPCar = 0;
        int totalHPTruck = 0;
        int count = 0;
        int countCar = 0;
        int countTruck = 0;
        while(!command.equals("End")) {
            list.add(new Car(command));

            if (list.get(count).getType().equals("truck")) {
                totalHPTruck += list.get(count).getHorsePoewer();
                countTruck++;
            } else {
                totalHPCar += list.get(count).getHorsePoewer();
                countCar++;
            }
            if (list.get(count).getType().equals("truck")) {
                list.get(count).type = "Truck";

            } else {
                list.get(count).type = "Car";
            }
            count++;
            command = scanner.nextLine();
        }

        double averageCar = totalHPCar * 1.0 / countCar;
        double averageTruck = totalHPTruck * 1.0 / countTruck;
        if (totalHPCar == 0) {
            averageCar = 0.00;
        }
        if (totalHPTruck == 0) {
            averageTruck = 0.00;
        }

        command = scanner.nextLine();
        while(!command.equals("Close the Catalogue")) {
            for (int n = 0; n < list.size(); n++) {
                if (command.equals(list.get(n).getModel())) {
                    System.out.println("Type: " + list.get(n).getType());
                    System.out.println("Model: " + list.get(n).getModel());
                    System.out.println("Color: " + list.get(n).getColor());
                    System.out.println("Horsepower: " + list.get(n).getHorsePoewer());
                    break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", averageCar);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruck);
    }
}
