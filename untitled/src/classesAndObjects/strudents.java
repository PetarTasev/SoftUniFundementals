package classesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class strudents {

    static class Student {
        String firstName;
        String secondName;
        String grade;

        Student (String line, List<Double> grades) {
            String[] info = line.split(" ");
            this.firstName = info[0];
            this.secondName = info[1];
            this.grade = (info[2]);
            grades.add(Double.parseDouble(info[2]));
        }

        double getGrade() {
            return Double.parseDouble(grade);
        }

        String getFullInfo() {
            return firstName + " " + secondName + ": " + grade;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list = new ArrayList<Student>();
        List<Double> grade = new ArrayList<>();

        int count = Integer.parseInt(scanner.nextLine());
        for (int n = 0; n < count; n++) {
            list.add(new Student(scanner.nextLine(), grade));
        }
        List<Double> sortedList = grade.stream().sorted().collect(Collectors.toList());

        int cunter = sortedList.size() - 1;
        for (int n = 0; n < count; n++) {
            if (sortedList.get(cunter) == list.get(n).getGrade()) {
                System.out.println(list.get(n).getFullInfo());
                     if (cunter > 0) {
                    cunter--;
                    n = -1;
                }
            }
        }
    }
}
