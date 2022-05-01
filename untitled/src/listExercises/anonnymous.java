package listExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonnymous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String line = scanner.nextLine();
        while(!line.equals("course start")) {
            String[] command = line.split(":");
            switch (command[0]) {
                case "Add" :
                    if (!list.contains(command[1])) {
                        list.add(command[1]);
                    }
                    break;
                case "Insert" :
                    if (!list.contains(command[1])) {
                        list.add(Integer.parseInt(command[2]), command[1]);
                    }
                    break;
                case "Remove" :
                    if (list.contains(command[1])) {
                        list.remove(list.indexOf(command[1]));
                    }
                    break;
                case "Swap" :
                    if (list.contains(command[1]) && list.contains(command[2])) {
                        if (list.contains(command[1] + "-Exercise") && list.contains(command[2] + "-Exercise")) {
                            int indexOne = list.indexOf(command[1]);
                            int indexTwo = list.indexOf(command[2]);

                            list.remove(indexOne);
                            list.remove(indexOne);
                            list.add(indexOne, command[2]);
                            list.add(indexOne, command[2] + "-Exercise");
                            list.remove(indexTwo);
                            list.remove(indexTwo);
                            list.add(indexTwo, command[1]);
                            list.add(indexTwo, command[1] + "-Exercise");

                        } else if (list.contains(command[1] + "-Exercise")) {
                            int indexOne = list.indexOf(command[1]);
                            int indexTwo = list.indexOf(command[2]);

                            list.remove(indexOne);
                            list.remove(indexOne);
                            list.add(indexOne, command[2]);
                            list.remove(indexTwo);
                            list.add(indexTwo, command[1] + "-Exercise");
                            list.add(indexTwo, command[1]);

                        } else if (list.contains(command[2] + "-Exercise")) {
                            int indexOne = list.indexOf(command[1]);
                            int indexTwo = list.indexOf(command[2]);
                            int indexTwo2 = indexTwo + 1;

                            list.remove(indexTwo);
                            list.remove(indexTwo);
                            list.add(indexTwo, command[1]);
                            list.remove(indexOne);
                            list.add(indexOne, command[2] + "-Exercise");
                            list.add(indexOne, command[2]);

                        } else {
                            int indexOne = list.indexOf(command[1]);
                            int indexTwo = list.indexOf(command[2]);

                            list.remove(indexOne);
                            list.add(indexOne, command[2]);
                            list.remove(indexTwo);
                            list.add(indexTwo, command[1]);
                        }

                    }
                    break;
                case "Exercise" :
                    if (list.contains(command[1])) {
                        if (!list.contains(command[1] + "-Exercise")) {
                            list.add(list.indexOf(command[1]) + 1, command[1] + "-Exercise");
                        }
                    } else {
                        list.add(command[1]);
                        list.add(list.indexOf(command[1]) + 1, command[1] + "-Exercise");
                    }
                    break;
            }
            line = scanner.nextLine();
        }
        for (String course : list) {
            System.out.println((list.indexOf(course) + 1) + "." + course);
        }
    }
}
//        Exercise:{lessonTitle} -add Exercise in the schedule right after the lesson index,
//        if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise".
//        If the lesson doesn't exist, add the lesson at the end of the course schedule, followed by the Exercise.
